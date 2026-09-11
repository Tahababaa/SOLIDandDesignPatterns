public class PaymentGateway {

    private final PaymentGatewayFactory primaryFactory;
    private final PaymentGatewayFactory fallbackFactory;

    public PaymentGateway(PaymentGatewayFactory primaryFactory,PaymentGatewayFactory fallbackFactory){
        this.primaryFactory=primaryFactory;
        this.fallbackFactory=fallbackFactory;


    }
    public PaymentResult pay(PaymentRequest request) {

        PaymentProcessor primaryProcessor =
                primaryFactory.createPaymentProcessor();

        try {

            return primaryProcessor.pay(request);

        } catch (ProviderUnavailableException e) {

            System.out.println(
                    "Primary provider unavailable."
            );

            System.out.println(
                    "Switching to fallback provider."
            );

            PaymentProcessor fallbackProcessor =
                    fallbackFactory.createPaymentProcessor();

            return fallbackProcessor.pay(request);
        }
    }
    public RefundResult refund(RefundRequest request) {

        RefundProcessor primaryProcessor =
                primaryFactory.createRefundProcessor();

        try {

            return primaryProcessor.refund(request);

        } catch (ProviderUnavailableException e) {

            System.out.println(
                    "Primary refund provider unavailable."
            );

            System.out.println(
                    "Switching to fallback provider."
            );

            RefundProcessor fallbackProcessor =
                    fallbackFactory.createRefundProcessor();

            return fallbackProcessor.refund(request);
        }
    }
}
