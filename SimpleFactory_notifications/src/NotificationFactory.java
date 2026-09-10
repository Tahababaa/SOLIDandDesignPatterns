public class NotificationFactory {

    public static Notification createNotification(NotificationType type){
        if(type==NotificationType.EMAIL){
            return new EmailNotification();
        }
        else if(type==NotificationType.SMS){
            return new SMSNotification();

        }
        else if(type==NotificationType.PUSH){
            return new PushNotification();
        }
        else if(type==NotificationType.WHATSAPP){
            return new WhatsappNotification();
        }

        throw new RuntimeException("Invalid type:" +type);
    }
}
