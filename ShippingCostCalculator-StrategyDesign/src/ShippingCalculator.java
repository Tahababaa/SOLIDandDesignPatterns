public class ShippingCalculator {

    private final ShippingStrategy strategy;

    public ShippingCalculator(ShippingStrategy strategy){
        this.strategy=strategy;
    }

    public double calculate(double weight){
        return strategy.calculateShippingCost(weight);
    }
}
