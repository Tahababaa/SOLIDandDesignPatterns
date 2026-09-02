package solid;

public class CreditCardPayment implements PaymentGateway{
    @Override
    public void pay(double amount) {
        System.out.println("Processing payment of Rs "+amount+" using Credit Card!");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding Rs "+amount+" using Credit Card!");
    }
}
