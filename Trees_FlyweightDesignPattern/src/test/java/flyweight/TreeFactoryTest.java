package flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreeFactoryTest {

    @Test
    void shouldReuseSameFlyweight() {

        TreeFactory factory = new TreeFactory();

        Tree tree1 = factory.getTree(
                "Oak",
                "Green",
                "oak.png"
        );

        Tree tree2 = factory.getTree(
                "Oak",
                "Green",
                "oak.png"
        );

        assertSame(tree1, tree2);
    }

    @Test
    void shouldCreateDifferentFlyweightsForDifferentIntrinsicState() {

        TreeFactory factory = new TreeFactory();

        Tree oak = factory.getTree(
                "Oak",
                "Green",
                "oak.png"
        );

        Tree pine = factory.getTree(
                "Pine",
                "Dark Green",
                "pine.png"
        );

        assertNotSame(oak, pine);
    }

    @Test
    void shouldCreateOnlyOneFlyweightForRepeatedRequests() {

        TreeFactory factory = new TreeFactory();

        for (int i = 0; i < 1000; i++) {
            factory.getTree(
                    "Oak",
                    "Green",
                    "oak.png"
            );
        }

        assertEquals(1, factory.getTreeCount());
    }
}