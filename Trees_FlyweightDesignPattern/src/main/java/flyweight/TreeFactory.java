package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private Map<String,Tree> trees = new HashMap<>();
    public Tree getTree(String type,String color,String texture){
        if(!trees.containsKey(type)){
            trees.put(type,new Tree(type,color,texture));

        }
        return trees.get(type);
    }

}
