public abstract class NotificationFactory {

    public abstract NotificationType notificationType();
    public abstract Notification createNotification(String recipient,String sender,NotificationTemplate template);
    public abstract NotificationTemplate createTemplate(String message);
    public abstract NotificationSender createSender(Notification notification);
}
