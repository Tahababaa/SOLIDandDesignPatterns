public class StripeGateway implements PaymentGateway{
    private String apiKey;
    private int timeout;
    private int maxRetries;

    public StripeGateway(String apiKey,int timeout, int maxRetries){
        this.apiKey=apiKey;
        this.maxRetries=maxRetries;
        this.timeout=timeout;
    }
    public StripeGateway(StripeGateway other){
        this.apiKey=other.apiKey;
        this.maxRetries=other.maxRetries;
        this.timeout=other.timeout;
    }
    @Override
    public void pay(double amount){
        System.out.println("Processing Rs "+amount+" through Stripe");
    }

    @Override
    public String getGatewayName(){
        return "Stripe";

    }

    @Override
    public StripeGateway clone() {
        return new StripeGateway(this);
    }
}
