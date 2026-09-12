public class SMSSender extends NotificationSender{

    public SMSSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to "+getNotification().getRecipient());
        System.out.println("Message: "+getNotification().getTemplate().getMessage());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }

}
