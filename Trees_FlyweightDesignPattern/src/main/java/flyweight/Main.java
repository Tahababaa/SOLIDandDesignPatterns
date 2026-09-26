package flyweight;

public class Main {
    public static void main(String[] args) {
        TreeFactory treeFactory = new TreeFactory();
        Tree t1 = treeFactory.getTree("Oak","Green","oak.png");
        Tree t2 = treeFactory.getTree("Oak","Green","oak.png");

        Tree t3 = treeFactory.getTree("Pine","Dark Green","pine.png");

        System.out.println(t1==t2);
        System.out.println(t2==t3);
    }
}
