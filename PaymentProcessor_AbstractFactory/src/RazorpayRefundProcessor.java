public class RazorpayRefundProcessor
        implements RefundProcessor {

    @Override
    public RefundResult refund(RefundRequest request) {

        System.out.println(
                "Processing refund using Razorpay"
        );

        return new RefundResult(
                true,
                "RAZORPAY-REFUND-ID",
                "Refund successful"
        );
    }
}