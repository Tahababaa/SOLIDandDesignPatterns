package flyweight;

public class Tree {

    private final String type;
    private final String color;
    private final String texture;

    public Tree(String type, String color, String texture) {
        this.type = type;
        this.texture = texture;
        this.color = color;
    }
    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }
}
