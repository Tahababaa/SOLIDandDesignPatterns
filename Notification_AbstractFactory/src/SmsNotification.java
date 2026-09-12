public class SmsNotification extends Notification{

    private final String sender;

    public SmsNotification(String recipient, NotificationTemplate template, String sender) {
        super(recipient, template);
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS sent to: "+getRecipient()+" by "+getSender());
        System.out.println("Message: "+getTemplate().getMessage());

    }
}
