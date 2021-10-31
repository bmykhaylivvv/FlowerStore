package FlowerStore;

import lombok.ToString;

@ToString
public class FlowerPack{
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    public String getDescription() {
        return "It`s a pack of " + this.amount + " flowers. Price: " + this.getPrice();
    }
}
