public class InternationalShippingStrategy implements ShippingStrategy{

    @Override
    public double calculateShippingCost(double weight){
        return 20*weight;
    }
}
