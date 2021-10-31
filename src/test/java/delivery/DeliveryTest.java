package delivery;

import FlowerStore.FlowerBucket;
import FlowerStore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {
    private DHLDeliveryStrategy dhlDelivery;
    private PostDeliveryStrategy postDelivery;
    private ArrayList<Item> items;

    @BeforeEach
    void setUp() {
        dhlDelivery = new DHLDeliveryStrategy();
        postDelivery = new PostDeliveryStrategy();

        FlowerBucket flowerBucket = new FlowerBucket();
        items = new ArrayList<Item>();
        items.add(flowerBucket);
    }

    @Test
    void dhlDeliver() {
        assertEquals(dhlDelivery.deliver(items), true);
    }

    @Test
    void postDeliver() {
        assertEquals(postDelivery.deliver(items), true);
    }
}