package FlowerStore;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class FlowerBucket extends Item{
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0.0;

        for (int i = 0; i < flowerPacks.size(); i++) {
            price += flowerPacks.get(i).getPrice();
        }

        return price;
    }

    @Override
    public String getDescription() {
        return "It`s an amazing bucket. Price: " + this.getPrice();
    }
}
