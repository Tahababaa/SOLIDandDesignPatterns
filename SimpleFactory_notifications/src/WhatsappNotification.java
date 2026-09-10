public class WhatsappNotification implements Notification{

    @Override
    public void send(String message){
        System.out.println("Whatsapp text: "+message);
    }
}
