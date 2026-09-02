package solid;

public class PaypalPayment implements PaymentGateway{
    @Override
    public void pay(double amount) {
        System.out.println("Processing payment of Rs "+amount+" using PayPal!");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding Rs "+amount+" using PayPal!");
    }
}
