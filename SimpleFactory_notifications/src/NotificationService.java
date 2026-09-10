public class NotificationService {

    public void sendNotification(NotificationType type,String message){
        Notification notification = NotificationFactory.createNotification(type);

        notification.send(message);
    }
}
