package decorators;

import FlowerStore.Flower;
import FlowerStore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemDecoratorTest {
    private Flower flower;
    private PaperDecorator paperDecorator;
    private BasketDecorator basketDecorator;
    private RibbonDecorator ribbonDecorator;

    @BeforeEach
    void setUp() {
        flower = new Flower(10, 50, new int[] {255, 255, 155}, FlowerType.ROSE);
    }

    @Test
    void getPricePaperDecorator() {
        paperDecorator = new PaperDecorator(flower);
        assertEquals(paperDecorator.getPrice(), 23);
    }

    @Test
    void getPriceBasketDecorator() {
        basketDecorator = new BasketDecorator(flower);
        assertEquals(basketDecorator.getPrice(), 14);
    }

    @Test
    void getPriceRibbonDecorator() {
        ribbonDecorator = new RibbonDecorator(flower);
        assertEquals(ribbonDecorator.getPrice(), 50);
    }
}