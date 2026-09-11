public class PaymentResult {

    private final boolean success;
    private final String transactions;
    private final String message;

    public PaymentResult(boolean success, String transactions, String message) {
        this.success = success;
        this.transactions = transactions;
        this.message = message;
    }

    public String getTransactions() {
        return transactions;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
