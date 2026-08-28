public interface BadPaymentGateway {
    void pay(double amount);
    void refund(double amount);
    void sendReceipt(double amount);
    void logPayment(double amount);
}

// ISP violation
