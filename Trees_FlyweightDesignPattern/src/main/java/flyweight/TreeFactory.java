package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private Map<TreeKey,Tree> trees = new HashMap<>();
    public Tree getTree(String type,String color,String texture){
        TreeKey key = new TreeKey(type, color, texture);

        if(!trees.containsKey(key)){
            trees.put(key,new Tree(type,color,texture));

        }
        return trees.get(key);
    }
    public int getTreeCount()
    {
        return trees.size();
    }
}
