import java.util.ArrayList;
import java.util.List;

public enum EnumLogger {
    INSTANCE;
    private final List<String> logs;
    private EnumLogger(){
        logs=new ArrayList<>();
    }
    public void log(String message){
        logs.add(message);
        System.out.println("[LOG] "+message);

    }

    public List<String> getLogs() {
        return new ArrayList<>(logs);
    }
}
