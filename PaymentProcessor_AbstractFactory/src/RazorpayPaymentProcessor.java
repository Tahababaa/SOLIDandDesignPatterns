public class RazorpayPaymentProcessor implements PaymentProcessor{

    @Override
    public PaymentResult pay(PaymentRequest request) {
        System.out.println("Calling Razorpay....");
        System.out.println("Processing Payment using Razorpay!");

        return new PaymentResult(true,"Razorpay-pymt-id","Payment is successful");



    }
}
