package flyweight;

import java.util.Objects;

public class TreeKey {

    private final String type;
    private final String color;
    private final String texture;

    public TreeKey(String type, String color, String texture) {
        this.type = type;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof TreeKey)) {
            return false;
        }

        TreeKey treeKey = (TreeKey) o;

        return Objects.equals(type, treeKey.type)
                && Objects.equals(color, treeKey.color)
                && Objects.equals(texture, treeKey.texture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, color, texture);
    }
}