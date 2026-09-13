public class CheckoutService {
    private PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor processor){
        this.paymentProcessor=processor;
    }

    public void checkout(double cartTotal,String paymentInfo){
        System.out.println("\n--- Processing Checkout ---");
        System.out.println("Amount: " + cartTotal);
        System.out.println("Provider: " + paymentProcessor.getProviderName());
        paymentProcessor.processPayment(cartTotal, paymentInfo);
        System.out.println("--- Checkout Complete ---");
    }
}
