package solid;

public class ConsolePaymentLogger implements PaymentLogger{
    @Override
    public void logPayment(double amount) {
        System.out.println("The payment of Rs "+amount+" logged successfully!");
    }
}
