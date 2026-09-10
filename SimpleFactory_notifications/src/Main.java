
public class Main {
    public static void main(String[] args) {

        NotificationService service1 = new NotificationService();
        service1.sendNotification("sms","Good morning Taha!");
        service1.sendNotification("EMAIL", "Welcome!");

        service1.sendNotification("SMS", "Your OTP is 123456");

        service1.sendNotification("PUSH", "You have a new notification");
        service1.sendNotification("Whatsapp", "You have a class scheduled at 9pm");
    }
}