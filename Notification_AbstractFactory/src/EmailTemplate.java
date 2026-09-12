public class EmailTemplate extends NotificationTemplate{

    public EmailTemplate(String message){
        super(message);
    }

    @Override
    public void format() {
        System.out.println("Formatting email Template!");
    }

}
