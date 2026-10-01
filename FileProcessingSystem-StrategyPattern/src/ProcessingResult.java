public class ProcessingResult {
    private boolean wasSuccessful;
    private String message;
    private int count ;

    public ProcessingResult(boolean wasSuccessful,String message){
        this.wasSuccessful=wasSuccessful;
        this.message=message;

    }

    public String getMessage() {
        return message;
    }

    public int getCount() {
        return count;
    }

    public boolean isWasSuccessful() {
        return wasSuccessful;
    }
    public String toString(){
        return "Processing Status: "+this.wasSuccessful +
                "\nMessage: " +this.message +
                "\nSuccess Count: "+ count;
    }
}
