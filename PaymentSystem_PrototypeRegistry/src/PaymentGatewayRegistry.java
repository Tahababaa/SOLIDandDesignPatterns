import java.util.HashMap;
import java.util.Map;

public class PaymentGatewayRegistry {

    private Map<String,PaymentGateway> registry;

    public PaymentGatewayRegistry(){
        registry=new HashMap<>();
    }

    public void register(String key, PaymentGateway obj){
        registry.put(key,obj);
    }
    public PaymentGateway create(String key){
        PaymentGateway prototype = registry.get(key);

        if (prototype == null) {
            throw new IllegalArgumentException(
                    "No payment gateway registered for key: " + key
            );
        }

        return prototype.clone();
    }
}
