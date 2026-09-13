public class GooglepayAdapter implements PaymentProcessor{
    private GooglepayPaymentGateway googlepay;

    public GooglepayAdapter(){
        googlepay=new GooglepayPaymentGateway();
    }


    @Override
    public void processPayment(double amount, String paymentInfo) {
        googlepay.processTransaction(paymentInfo,amount);
    }

    @Override
    public String getProviderName() {
        return "GooglePay";
    }
}
