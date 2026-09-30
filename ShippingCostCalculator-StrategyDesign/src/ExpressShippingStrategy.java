public class ExpressShippingStrategy implements ShippingStrategy{

    @Override
    public double calculateShippingCost(double weight) {
        return weight * 10;
    }
}
