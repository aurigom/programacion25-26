package ud8.examen.Uribe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PagoModel {

    // ------------------ INSERTAR PAGO ------------------
    public static void insertPago(Connection con, Pago p) throws SQLException {
    	String insert = "insert into payments values (?,?,?,?)";
    	PreparedStatement sentencia = con.prepareStatement(insert);
    	
    	sentencia.setInt(1, Pago.getCustomerNumber());
    	sentencia.setString(2, Pago.getCheckNumber());
    	sentencia.setString(3, Pago.getPaymentDate());
    	sentencia.setDouble(4, Pago.getAmount());
    	
    	sentencia.executeUpdate();

    }

    // ------------------ CONSULTAR IMPORTE ------------------
    public static double getImporte(Connection con, int customerNumber, String checkNumber)
            throws SQLException {
    	double importe = 0;
    	String consulta = "select amount from payments where checkNumber=? and customerNumber=?";
    	PreparedStatement sentencia = con.prepareStatement(consulta);
    	
    	sentencia.setString(1, checkNumber);
    	sentencia.setInt(2, customerNumber);
    	
    	ResultSet rs = sentencia.executeQuery() ; 
    	importe = rs.getDouble("amount");
    	
    	return importe;
    	
    }

    // ------------------ ACTUALIZAR IMPORTE ------------------
    public static void updateImporte(Connection con, int customerNumber, String checkNumber, double nuevoImporte)
            throws SQLException {


    	String sql = "update payments set amount=? where customerNumber=? and checkNumber=?";
    	PreparedStatement sentencia = con.prepareStatement(sql);
    	
    	sentencia.setDouble(1,nuevoImporte);
    	sentencia.setInt(2, customerNumber);
    	sentencia.setString(3, checkNumber);
    	
    	sentencia.executeUpdate();
    }

    // ------------------ ELIMINAR PAGO ------------------
    public static void deletePago(Connection con, int customerNumber, String checkNumber)
            throws SQLException {

    	
    	String delete = "delete from payments where customerNumber = ? and checkNumber = ?";
    	PreparedStatement sentencia  = con.prepareStatement(delete);
    	
    	sentencia.setInt(1, customerNumber);
    	sentencia.setString(2, checkNumber);
    	
    	sentencia.executeUpdate();
    

    }
}

