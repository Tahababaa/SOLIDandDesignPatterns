package solid;

public class PaymentProcessor {

    private PaymentLogger paymentLogger;
    private ReceiptService receiptService;
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway,PaymentLogger paymentLogger,ReceiptService receiptService){
        this.paymentLogger=paymentLogger;
        this.paymentGateway=paymentGateway;
        this.receiptService=receiptService;

    }
    public void processPayment(double amount){
        paymentGateway.pay(amount);
        paymentLogger.logPayment(amount);
        receiptService.sendReceipt(amount);

    }
}
