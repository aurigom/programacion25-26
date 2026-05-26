package ud8.examen.Uribe;

public class Pago {

    private static int customerNumber;
    private static  String checkNumber;
    private static String paymentDate;
    private static double amount;

    public Pago(int customerNumber, String checkNumber, String paymentDate, double amount) {
        this.customerNumber = customerNumber;
        this.checkNumber = checkNumber;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    public static  int getCustomerNumber() { return customerNumber; }
    public static String getCheckNumber() { return checkNumber; }
    public static String getPaymentDate() { return paymentDate; }
    public static double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }
}
