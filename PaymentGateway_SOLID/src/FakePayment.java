package solid;

public class FakePayment implements PaymentGateway{

    @Override
    public void pay(double amount) {
        System.out.println("Fake payment done for Rs "+amount);
    }

    @Override
    public void refund(double amount) {
        throw new UnsupportedOperationException();

    }

//    LSP violation /
}
