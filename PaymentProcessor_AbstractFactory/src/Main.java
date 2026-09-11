//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Create the primary factory
        PaymentGatewayFactory stripeFactory =
                new StripeFactory();

        // 2. Create the fallback factory
        PaymentGatewayFactory razorpayFactory =
                new RazorpayFactory();

        // 3. Create the failover-aware gateway
        PaymentGateway paymentGateway =
                new PaymentGateway(
                        stripeFactory,
                        razorpayFactory
                );

        // 4. Create a payment request
        PaymentRequest paymentRequest =
                new PaymentRequest(
                        "ORDER-1001",
                        5000.0
                );

        // 5. Make payment
        PaymentResult result =
                paymentGateway.pay(paymentRequest);

        // 6. Print result
        System.out.println("Payment Success: "
                + result.isSuccess());

        System.out.println("Message: "
                + result.getMessage());


    }
}