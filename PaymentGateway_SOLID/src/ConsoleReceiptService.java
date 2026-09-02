package solid;

public class ConsoleReceiptService implements ReceiptService{


    @Override
    public void sendReceipt(double amount) {
        System.out.println("Receipt for payment of Rs "+amount+" sent successfully!");
    }
}
