package delivery;

import FlowerStore.Item;

import java.util.List;

public class DHLDeliveryStrategy {
    public boolean deliver(List<Item> items) {
        System.out.println("Items delivered with DHL");
        return true;
    }
}
