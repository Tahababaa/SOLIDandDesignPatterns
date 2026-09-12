public class EmailSender extends NotificationSender{

    public EmailSender(Notification notification){
        super(notification);
    }
    @Override
    public void send(){
        System.out.println("Sending Email to "+getNotification().getRecipient());
        System.out.println("Message: "+getNotification().getTemplate().getMessage());
    }

    public NotificationType notificationType(){
        return NotificationType.EMAIL;
    }
}
