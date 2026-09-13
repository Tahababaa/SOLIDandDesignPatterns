public class PhonepeAdapter implements PaymentProcessor{

    private PhonepePaymentGateway phonepe;
    public PhonepeAdapter(){
        phonepe=new PhonepePaymentGateway();
    }

    @Override
    public void processPayment(double amount, String paymentInfo) {
        phonepe.executePayment(amount,paymentInfo);

    }

    @Override
    public String getProviderName() {
        return "PhonePe";
    }
}
