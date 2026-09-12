public class SMSNotificationFactory extends NotificationFactory{

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new SmsNotification(recipient,template,sender);
    }

    @Override
    public NotificationTemplate createTemplate(String message) {
        return new SMSTemplate(message);
    }

    @Override
    public NotificationSender createSender(Notification notification) {
        return new SMSSender(notification);
    }
}
