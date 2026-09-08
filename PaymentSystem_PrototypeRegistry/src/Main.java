
public class Main {

    public static void main(String[] args) {

        // ============================================================
        // 1. Create the Registry
        // ============================================================

        PaymentGatewayRegistry registry =
                new PaymentGatewayRegistry();


        // ============================================================
        // 2. Create the Prototype objects
        // ============================================================

        PaymentGateway stripePrototype =
                new StripeGateway(
                        "stripe-secret-key",
                        5000,
                        3
                );

        PaymentGateway razorpayPrototype =
                new RazorpayGateway(
                        "razorpay-secret-key",
                        3000,
                        2
                );


        // ============================================================
        // 3. Register the prototypes
        //
        // Registry stores:
        //
        // "stripe"   -> Stripe prototype
        // "razorpay" -> Razorpay prototype
        // ============================================================

        registry.register("stripe", stripePrototype);
        registry.register("razorpay", razorpayPrototype);


        // ============================================================
        // 4. Ask the Registry to create a Stripe gateway
        //
        // IMPORTANT:
        //
        // registry.create("stripe")
        //
        // internally does:
        //
        // registry.get("stripe")
        //             |
        //             v
        //      Stripe prototype
        //             |
        //          clone()
        //             |
        //             v
        //       New Stripe object
        // ============================================================

        PaymentGateway stripeGateway1 =
                registry.create("stripe");


        // ============================================================
        // 5. Create another Stripe gateway
        //
        // This should create ANOTHER object by cloning the same
        // prototype.
        // ============================================================

        PaymentGateway stripeGateway2 =
                registry.create("stripe");


        // ============================================================
        // 6. Create a Razorpay gateway
        // ============================================================

        PaymentGateway razorpayGateway =
                registry.create("razorpay");


        // ============================================================
        // 7. Use the created objects
        // ============================================================

        System.out.println("------ Payment Gateway Operations ------");

        stripeGateway1.pay(100);

        stripeGateway2.pay(500);

        razorpayGateway.pay(1000);


        // ============================================================
        // 8. Verify that the cloned objects are different objects
        // ============================================================

        System.out.println();
        System.out.println("------ Object Identity Test ------");

        System.out.println(
                "stripeGateway1 == stripeGateway2 : "
                        + (stripeGateway1 == stripeGateway2)
        );

        System.out.println(
                "stripePrototype == stripeGateway1 : "
                        + (stripePrototype == stripeGateway1)
        );

        System.out.println(
                "stripePrototype == stripeGateway2 : "
                        + (stripePrototype == stripeGateway2)
        );

        System.out.println(
                "razorpayPrototype == razorpayGateway : "
                        + (razorpayPrototype == razorpayGateway)
        );


        // ============================================================
        // 9. Verify that the gateway types are correct
        // ============================================================

        System.out.println();
        System.out.println("------ Gateway Type Test ------");

        System.out.println(
                "stripeGateway1 : "
                        + stripeGateway1.getGatewayName()
        );

        System.out.println(
                "stripeGateway2 : "
                        + stripeGateway2.getGatewayName()
        );

        System.out.println(
                "razorpayGateway : "
                        + razorpayGateway.getGatewayName()
        );


        // ============================================================
        // 10. Create many Stripe objects
        //
        // This demonstrates the actual motivation behind the pattern.
        //
        // We don't repeatedly construct StripeGateway manually.
        // We simply ask the Registry for more instances.
        // ============================================================

        System.out.println();
        System.out.println("------ Creating Multiple Stripe Gateways ------");

        PaymentGateway stripeGateway3 =
                registry.create("stripe");

        PaymentGateway stripeGateway4 =
                registry.create("stripe");

        PaymentGateway stripeGateway5 =
                registry.create("stripe");

        stripeGateway3.pay(150);
        stripeGateway4.pay(250);
        stripeGateway5.pay(350);


        // ============================================================
        // 11. Test invalid registry key
        //
        // There is no gateway registered under "paypal".
        // Our Registry should throw an exception.
        // ============================================================

        System.out.println();
        System.out.println("------ Invalid Key Test ------");

        try {

            PaymentGateway paypalGateway =
                    registry.create("paypal");

            paypalGateway.pay(100);

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "Exception caught: " + e.getMessage()
            );
        }


        // ============================================================
        // 12. Final summary
        // ============================================================

        System.out.println();
        System.out.println("------ Design Demonstration Complete ------");

        System.out.println(
                "Registry stores prototypes."
        );

        System.out.println(
                "Registry.create() finds the prototype."
        );

        System.out.println(
                "Prototype.clone() creates a new object."
        );

        System.out.println(
                "The client never directly accesses the stored prototype."
        );
    }
}

