import javax.sound.midi.Soundbank;

public class EmailNotification extends Notification{

    private final String sender;

    public EmailNotification(String recipient,String sender,NotificationTemplate template){
        super(recipient,template);
        this.sender=sender;
    }
    public String getSender(){
        return this.sender;
    }
    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent to: "+getRecipient()+" by "+getSender());
        System.out.println("Message: "+ getTemplate().getMessage());

    }
}
