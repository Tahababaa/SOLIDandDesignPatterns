public abstract  class NotificationTemplate {

    private final String message;

    public NotificationTemplate(String message){
        this.message=message;
    }
    public String getMessage(){
        return this.message;
    }

    public abstract void format();
}
