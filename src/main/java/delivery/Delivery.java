package delivery;

import FlowerStore.Item;

import java.util.List;

public interface Delivery {
    boolean deliver(List<Item> items);
}
