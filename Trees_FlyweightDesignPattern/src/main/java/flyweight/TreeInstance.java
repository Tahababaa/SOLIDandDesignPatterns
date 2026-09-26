package flyweight;

public class TreeInstance {
    private Tree tree;
    private  int x;
    private int y;

    public TreeInstance(Tree tree, int x, int y){
        this.tree = tree;
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Tree getTree() {
        return tree;
    }
}
