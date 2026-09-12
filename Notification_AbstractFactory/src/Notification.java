public abstract class Notification {

    private final String recipient;
    private final NotificationTemplate template;

    public Notification(String recipient, NotificationTemplate template) {
        this.recipient = recipient;
        this.template = template;
    }
    public String getRecipient(){
        return this.recipient;
    }

    public NotificationTemplate getTemplate(){
        return this.template;
    }

    public abstract NotificationType notificationType();
    public abstract  void sendNotification();
}

