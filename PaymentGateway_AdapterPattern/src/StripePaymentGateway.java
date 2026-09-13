public class StripePaymentGateway {

    public void chargeCard(String cardToken,double amount, String currency){
        System.out.println("✓ Stripe: Charged card token [" + cardToken + "] $" + amount + " " + currency);
    }
}
