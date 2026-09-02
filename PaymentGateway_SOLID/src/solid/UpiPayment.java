public class UpiPayment implements PaymentGateway{

    @Override
    public void pay(double amount) {
        System.out.println("Processing payment of Rs "+amount+" using UPI");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding Rs "+amount+" using UPI");

    }
}
