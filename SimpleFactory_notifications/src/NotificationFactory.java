public class NotificationFactory {

    public static Notification createNotification(String type){
        if(type.equalsIgnoreCase("EMAIL")){
            return new EmailNotification();
        }
        else if(type.equalsIgnoreCase("SMS")){
            return new SMSNotification();

        }
        else if(type.equalsIgnoreCase("PUSH")){
            return new PushNotification();
        }
        else if(type.equalsIgnoreCase("Whatsapp")){
            return new WhatsappNotification();
        }

        throw new RuntimeException("Invalid type:" +type);
    }
}
