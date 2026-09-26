package flyweight;

public class Main {

    public static void main(String[] args) {

//        TreeFactory factory = new TreeFactory();

//        TreeInstance tree1 =
//                new TreeInstance(
//                        factory.getTree("Oak", "Green", "oak.png"),
//                        10,
//                        20
//                );
//
//        TreeInstance tree2 =
//                new TreeInstance(
//                        factory.getTree("Oak", "Green", "oak.png"),
//                        50,
//                        80
//                );
//
//        TreeInstance tree3 =
//                new TreeInstance(
//                        factory.getTree("Oak", "Green", "oak.png"),
//                        100,
//                        40
//                );

//        System.out.println(tree1.getTree() == tree2.getTree());
//        System.out.println(tree2.getTree() == tree3.getTree());
//
//        System.out.println(tree1.getX() + ", " + tree1.getY());
//        System.out.println(tree2.getX() + ", " + tree2.getY());
//        System.out.println(tree3.getX() + ", " + tree3.getY());

//        TreeInstance tree1 =
//                new TreeInstance(
//                        factory.getTree("Oak", "Green", "oak.png"),
//                        10,
//                        20
//                );
//
//        TreeInstance tree2 =
//                new TreeInstance(
//                        factory.getTree("Oak", "Green", "oak.png"),
//                        50,
//                        80
//                );
//
//        TreeInstance tree3 =
//                new TreeInstance(
//                        factory.getTree("Pine", "Dark Green", "pine.png"),
//                        100,
//                        40
//                );
//
//        TreeInstance tree4 =
//                new TreeInstance(
//                        factory.getTree("Pine", "Dark Green", "pine.png"),
//                        150,
//                        90
//                );
//
//        tree1.display();
//        tree2.display();
//        tree3.display();
//        tree4.display();


        TreeFactory factory = new TreeFactory();
        Forest forest = new Forest(factory);

        forest.plantTree("Oak", "Green", "oak.png", 10, 20);
        forest.plantTree("Oak", "Green", "oak.png", 50, 80);
        forest.plantTree("Oak", "Green", "oak.png", 100, 40);

        forest.plantTree("Pine", "Dark Green", "pine.png", 150, 60);
        forest.plantTree("Pine", "Dark Green", "pine.png", 200, 100);
        forest.displayTrees();


        TreeFactory factory2 = new TreeFactory();
        Forest forest2 = new Forest(factory2);

        for (int i = 0; i < 10000; i++) {
            forest2.plantTree(
                    "Oak",
                    "Green",
                    "oak.png",
                    i,
                    i * 2
            );
        }

        System.out.println("Tree instances: " + forest2.getTreeCount());
        System.out.println("Flyweight objects: " + factory2.getTreeCount());
    }
}