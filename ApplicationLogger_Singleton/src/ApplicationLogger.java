import java.util.ArrayList;
import java.util.List;

public class ApplicationLogger {
    private static  volatile ApplicationLogger instance;

    private final List<String> logs;

    private ApplicationLogger(){
        logs=new ArrayList<>();
    }

    public static ApplicationLogger getInstance(){
        if(instance==null){
            synchronized (ApplicationLogger.class) {
                if (instance == null) {
                    instance = new ApplicationLogger();
                }
            }
        }
        return instance;
    }
    public void log(String message){
        logs.add(message);
        System.out.println("[LOG]-DCL "+message);

    }

    public List<String> getLogs() {
        return new ArrayList<>(logs);
    }
}
