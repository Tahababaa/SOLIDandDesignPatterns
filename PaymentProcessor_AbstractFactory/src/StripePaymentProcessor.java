public class StripePaymentProcessor implements PaymentProcessor{


    @Override
    public PaymentResult pay(PaymentRequest request) {
        System.out.println("Processing payment using Stripe");

        return new PaymentResult(true,"stripe-payment-id","Payment successful");
    }
}
