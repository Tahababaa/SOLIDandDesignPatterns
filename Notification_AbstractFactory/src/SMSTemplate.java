public class SMSTemplate extends NotificationTemplate{

    public SMSTemplate(String message){
        super(message);
    }
    @Override
    public void format(){
        System.out.println("Formatting SMS templates!");
    }
}
