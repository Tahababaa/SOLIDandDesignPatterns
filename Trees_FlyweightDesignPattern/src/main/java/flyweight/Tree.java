package flyweight;

public class Tree {

    private String type;
    private String color;
    private String texture;

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
