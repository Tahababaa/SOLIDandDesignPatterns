
public class Main {
    public static void main(String[] args) {

        NotificationService service1 = new NotificationService();
        service1.sendNotification(NotificationType.WHATSAPP,"Good morning Taha!");
        service1.sendNotification(NotificationType.EMAIL, "Welcome!");

        service1.sendNotification(NotificationType.SMS, "Your OTP is 123456");

        service1.sendNotification(NotificationType.PUSH, "You have a new notification");
        service1.sendNotification(NotificationType.WHATSAPP, "You have a class scheduled at 9pm");
    }
}