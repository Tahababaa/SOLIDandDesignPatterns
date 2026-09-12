public class PushSender extends NotificationSender {

    public PushSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending PUSH notification to " + getNotification().getRecipient());
        System.out.println("Message: " + getNotification().getTemplate().getMessage());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}