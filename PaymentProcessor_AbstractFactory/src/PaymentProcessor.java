public interface PaymentProcessor {
    PaymentResult pay(PaymentRequest request);
}
