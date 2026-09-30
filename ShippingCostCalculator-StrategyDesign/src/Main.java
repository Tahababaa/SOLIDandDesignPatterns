public class Main {
    public static void main(String[] args) {
        ShippingStrategy strategy = new StandardShippingStrategy();

        ShippingCalculator cal = new ShippingCalculator(strategy);

        double cost = cal.calculate(29);
        System.out.println(cost);
    }
}
