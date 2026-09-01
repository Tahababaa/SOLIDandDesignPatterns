//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
//        PaymentGateway p1 = new UpiPayment();
//        p1.pay(200);
//        p1.refund(29);
//
//        PaymentGateway cc = new CreditCardPayment();
//        cc.pay(20.4);
//        cc.refund(10.7);
//
//        PaymentProcessor pp1 = new PaymentProcessor();
//        pp1.processPayment(new UpiPayment(),2000);
//        pp1.processPayment(new PaypalPayment(),1876);

        PaymentLogger logger = new ConsolePaymentLogger();
        ReceiptService receiptService = new ConsoleReceiptService();
        PaymentGateway gateway = new CreditCardPayment();

        PaymentProcessor processor = new PaymentProcessor(gateway,logger, receiptService);

        processor.processPayment(2221);


//        PaymentGateway payment = new FakePayment(); // LSP violation
//        payment.refund(100);  // THROWS EXCEPTION

//        PaymentLogger logger2 = new ConsolePaymentLogger();
//        ReceiptService receiptService2 = new ConsoleReceiptService();
        PaymentGateway gateway2 = new UpiPayment();

        PaymentProcessor processor2 = new PaymentProcessor(gateway2,logger, receiptService);

        processor2.processPayment(123678);


    }
}