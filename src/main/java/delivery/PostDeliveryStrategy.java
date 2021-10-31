package delivery;

import FlowerStore.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{
    public boolean deliver(List<Item> items) {
        System.out.println("Items delivered with Post");
        return true;
    }
}
