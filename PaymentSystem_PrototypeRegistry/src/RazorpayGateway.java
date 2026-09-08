public class RazorpayGateway implements PaymentGateway{
    private String apiKey;
    private int timeout;
    private int maxRetries;

    public RazorpayGateway(String apiKey, int timeout, int maxRetries) {
        this.apiKey = apiKey;
        this.timeout = timeout;
        this.maxRetries = maxRetries;
    }
    public RazorpayGateway(RazorpayGateway other) {
        this.apiKey = other.apiKey;
        this.maxRetries = other.maxRetries;
        this.timeout = other.timeout;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Processing Rs "+amount+" through Razorpay");
    }

    @Override
    public String getGatewayName() {
        return "Razorpay";
    }
    @Override
    public RazorpayGateway clone() {
        return new RazorpayGateway(this);
    }
}
