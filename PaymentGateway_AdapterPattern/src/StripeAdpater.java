public class StripeAdpater implements PaymentProcessor{
    private StripePaymentGateway stripe;

    public StripeAdpater(){
        this.stripe=new StripePaymentGateway();
    }

    @Override
    public void processPayment(double amount, String paymentInfo) {
        String [] parts = paymentInfo.split("\\|");
        String cardToken = parts.length > 0 ? parts[0]:"tok_visa";
        String currency = parts.length >1 ? parts[1] : "USD";

        stripe.chargeCard(cardToken,amount,currency);
    }

    @Override
    public String getProviderName() {
        return "Stripe";
    }
}
