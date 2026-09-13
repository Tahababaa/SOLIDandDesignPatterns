
public class Main {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("║     Adapter Pattern: Payment Gateway Integration       ║");
        System.out.println("╚════════════════════════════════════════════════════════╝\n");

        // Create adapters for each payment provider
        PaymentProcessor stripeProcessor = new StripeAdpater();
        PaymentProcessor phonepeProcessor = new PhonepeAdapter();
        PaymentProcessor googlepayProcessor = new GooglepayAdapter();

        // Use them interchangeably - your code doesn't change!

        // Customer 1: Pays with Stripe
        CheckoutService checkout1 = new CheckoutService(stripeProcessor);
        checkout1.checkout(99.99, "tok_visa|USD");

        // Customer 2: Pays with PhonePe
        CheckoutService checkout2 = new CheckoutService(phonepeProcessor);
        checkout2.checkout(49.50, "john@example.com");

        // Customer 3: Pays with GooglePay
        CheckoutService checkout3 = new CheckoutService(googlepayProcessor);
        checkout3.checkout(199.00, "cust_12345");

        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("║ Notice: CheckoutService code is IDENTICAL for all      ║");
        System.out.println("║ three providers. The adapter handles the translation!  ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
    }
}