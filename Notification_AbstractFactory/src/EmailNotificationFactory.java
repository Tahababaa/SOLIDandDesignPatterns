public class EmailNotificationFactory extends NotificationFactory{
    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new EmailNotification(recipient,sender,template);
    }

    @Override
    public NotificationTemplate createTemplate(String message) {
        return new EmailTemplate(message);
    }

    @Override
    public NotificationSender createSender(Notification notification) {
        return new EmailSender(notification);
    }
}
