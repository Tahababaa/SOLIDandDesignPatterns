public class StripePaymentProcessor implements PaymentProcessor {


    @Override
    public PaymentResult pay(PaymentRequest request) {
        System.out.println("Calling Stripe. . . .");

        throw new ProviderUnavailableException("Stripe is unavailable!");
    }
}
