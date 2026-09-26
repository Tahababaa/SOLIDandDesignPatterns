package flyweight;

public class Main {

    public static void main(String[] args) {

        TreeFactory factory = new TreeFactory();

        TreeInstance tree1 =
                new TreeInstance(
                        factory.getTree("Oak", "Green", "oak.png"),
                        10,
                        20
                );

        TreeInstance tree2 =
                new TreeInstance(
                        factory.getTree("Oak", "Green", "oak.png"),
                        50,
                        80
                );

        TreeInstance tree3 =
                new TreeInstance(
                        factory.getTree("Oak", "Green", "oak.png"),
                        100,
                        40
                );

        System.out.println(tree1.getTree() == tree2.getTree());
        System.out.println(tree2.getTree() == tree3.getTree());

        System.out.println(tree1.getX() + ", " + tree1.getY());
        System.out.println(tree2.getX() + ", " + tree2.getY());
        System.out.println(tree3.getX() + ", " + tree3.getY());
    }
}