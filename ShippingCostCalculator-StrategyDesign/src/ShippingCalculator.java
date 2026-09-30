public class ShippingCalculator {

    private  ShippingStrategy strategy;

    public ShippingCalculator(ShippingStrategy strategy){
        this.strategy=strategy;
    }
    public void setStrategy( ShippingStrategy strategy){
        this.strategy=strategy;
    }

    public double calculate(double weight){
        if(weight<=0){
            throw  new IllegalArgumentException("Weight must be greater than 0!");
        }
        return strategy.calculateShippingCost(weight);
    }
}
