package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private TreeFactory treeFactory;
    private List<TreeInstance> trees;

    public Forest(TreeFactory treeFactory){
        this.treeFactory=treeFactory;
        this.trees=new ArrayList<>();
    }
    public void plantTree(String type, String color, String texture, int x, int y) {

        Tree tree = treeFactory.getTree(type, color, texture);

        TreeInstance treeInstance = new TreeInstance(tree, x, y);

        trees.add(treeInstance);
    }
    public void displayTrees(){
        for (TreeInstance tree : trees) {
            tree.display();
        }
    }
    public int getTreeCount() {
        return trees.size();
    }
}
