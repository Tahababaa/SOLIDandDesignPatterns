public class GooglepayPaymentGateway {
    public void processTransaction(String customerId, double transactionAmount){
        System.out.println("✓ GooglePay: Transaction of Rs " + transactionAmount + " for customer " + customerId);
    }
}
