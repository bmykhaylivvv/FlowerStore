package FlowerStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class FlowerTest {
    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(10);
        flower.setSepalLength(5);
        flower.setColor(new int[] {128, 128, 128});
        flower.setFlowerType(FlowerType.ROSE);
    }

    @Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }

    @Test
    void getSepalLength() {
        assertEquals(5, flower.getSepalLength());
    }

    @Test
    void getColor() {
        assertTrue(Arrays.equals(new int[] {128, 128, 128}, flower.getColor()));
        }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }
}