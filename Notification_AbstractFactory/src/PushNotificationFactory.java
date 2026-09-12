public class PushNotificationFactory extends NotificationFactory{

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new PushNotification(recipient,template);
    }

    @Override
    public NotificationTemplate createTemplate(String message) {
        return new PushTemplate(message);
    }

    @Override
    public NotificationSender createSender(Notification notification) {
        return new PushSender(notification);
    }
}
