public class Main {
    public static void main(String[] args) {
//        ShippingStrategy strategy = new InternationalShippingStrategy();
//
//        ShippingCalculator cal = new ShippingCalculator(strategy);
//
//        double cost = cal.calculate(29);
//        System.out.println("Shipping cost: "+cost);\\

        ShippingCalculator calculator = new ShippingCalculator(new StandardShippingStrategy());

        System.out.println(
                calculator.calculate(10)
        );

        calculator.setStrategy(
                new ExpressShippingStrategy()
        );

        System.out.println(
                calculator.calculate(10)
        );
        try {
            calculator.calculate(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        calculator.setStrategy(
                new InternationalShippingStrategy()
        );

        System.out.println(
                calculator.calculate(10)
        );

    }
}
