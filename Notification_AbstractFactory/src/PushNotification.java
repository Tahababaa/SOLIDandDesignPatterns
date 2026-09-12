public class PushNotification extends Notification{

    public PushNotification(String recipient, NotificationTemplate template){
        super(recipient,template);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public void sendNotification() {
        System.out.println("PUSH notification sent to: "+getRecipient());
        System.out.println("Message: "+getTemplate().getMessage() );

    }

}
