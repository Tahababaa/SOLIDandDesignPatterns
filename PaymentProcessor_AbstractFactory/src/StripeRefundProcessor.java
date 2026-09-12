public class StripeRefundProcessor implements RefundProcessor {

    @Override
    public RefundResult refund(RefundRequest request){
        System.out.println("Processing Refund using Stripe!");

        return new RefundResult(true,"Stripe-refund-id-here","Refund Successful");
    }
}
