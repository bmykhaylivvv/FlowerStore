package FlowerStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class FlowerTest {
    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(10, 5, new int[] {128, 128, 128}, FlowerType.ROSE);
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