package ud8.examen.Uribe;

import java.sql.Connection;
import java.sql.SQLException;

public class Principal {

    public static void main(String[] args) {
    	Connection con = Conexion.conectar();
        // Comprobamos la conexión ANTES del try/catch
        if (con == null) {
        	
            System.out.println("No se pudo establecer conexión con la BD.");
            return;
        }

        try {

        	con.setAutoCommit(false);
        	
        
            // TRANSACCIÓN 1: insertar dos pagos
            PagoModel.insertPago(con,
                    new Pago(110, "PAGO20", "2026-05-25", 200.00));
            System.out.println("Insertado PAGO1");

            PagoModel.insertPago(con,
                    new Pago(110, "PAGO21", "2026-05-26", 350.00));
            System.out.println("Insertado PAGO2");

            System.out.println("Transacción 1 completada\n");
            con.commit();
       
            // TRANSACCIÓN 2: actualizar importes con IVA 21%
            double imp1 = PagoModel.getImporte(con, 110, "PAGO20");
            double imp2 = PagoModel.getImporte(con, 110, "PAGO21");
 	
            double iva = 1.21;

            PagoModel.updateImporte(con, 110, "PAGO20", imp1 * iva);
            System.out.println("Actualizado PAGO20 con IVA");

            PagoModel.updateImporte(con, 110, "PAGO21", imp2 * iva);
            System.out.println("Actualizado PAGO21 con IVA");

            System.out.println("Transacción 2 completada\n");

            con.commit();
            
            // TRANSACCIÓN 3: borrar ambos pagos

            PagoModel.deletePago(con, 110, "PAGO20");
            PagoModel.deletePago(con, 110, "PAGO21");
            
            
            System.out.println("Transacción 3 completada\n");
            
            con.commit();

        } catch (SQLException e) {

            System.out.println("Error detectado, intentando rollback...");

            try {
            	
            	if (con != null) {
					con.rollback();
					System.out.println("Rollback realizado.");
				}
                    
                
            } catch (SQLException ex) {
                System.out.println("Error en rollback: " + ex.getMessage());
            }

            System.out.println("Error: " + e.getMessage());
        }
        try {
        	if (con!=null) {
				con.close();
				System.out.println("Conexión cerrada");
			}
        }catch(SQLException g) {
        	System.out.println("Error "+g.getMessage());
        }
    }
}

