public class PushTemplate extends NotificationTemplate{

    public PushTemplate(String message){
        super(message);
    }

    @Override
    public void format(){
        System.out.println("Formatting PUSH message!");
    }
}
