public interface PaymentGateway extends Prototype<PaymentGateway>{
    void pay(double amount);
    String getGatewayName();

}
