package solid;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
//        solid.PaymentGateway p1 = new solid.UpiPayment();
//        p1.pay(200);
//        p1.refund(29);
//
//        solid.PaymentGateway cc = new solid.CreditCardPayment();
//        cc.pay(20.4);
//        cc.refund(10.7);
//
//        solid.PaymentProcessor pp1 = new solid.PaymentProcessor();
//        pp1.processPayment(new solid.UpiPayment(),2000);
//        pp1.processPayment(new solid.PaypalPayment(),1876);

        PaymentLogger logger = new ConsolePaymentLogger();
        ReceiptService receiptService = new ConsoleReceiptService();
        PaymentGateway gateway = new CreditCardPayment();

        PaymentProcessor processor = new PaymentProcessor(gateway,logger, receiptService);

        processor.processPayment(2221);


//        solid.PaymentGateway payment = new solid.FakePayment(); // LSP violation
//        payment.refund(100);  // THROWS EXCEPTION

//        solid.PaymentLogger logger2 = new solid.ConsolePaymentLogger();
//        solid.ReceiptService receiptService2 = new solid.ConsoleReceiptService();
        PaymentGateway gateway2 = new UpiPayment();

        PaymentProcessor processor2 = new PaymentProcessor(gateway2,logger, receiptService);

        processor2.processPayment(123678);


    }
}