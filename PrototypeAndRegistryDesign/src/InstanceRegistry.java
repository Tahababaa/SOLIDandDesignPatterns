import java.util.HashMap;
import java.util.Map;

public class InstanceRegistry implements Registry{

    private Map<String,VMinstance> registry;

    public InstanceRegistry() {
        registry = new HashMap<>();
    }

    @Override
    public void add(String key, VMinstance obj) {
        registry.put(key,obj);

    }

    @Override
    public VMinstance getValue(String key) {
        VMinstance other = registry.get(key);
        if(other==null){
            return null;
        }
        return other.clone();
    }
}
