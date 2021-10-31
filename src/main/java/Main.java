import FlowerStore.*;
import decorators.PaperDecorator;
import decorators.RibbonDecorator;

public class Main {
    public static void main(String[] args) {
        // Create a store which contains flowersNum flowers
        Store store = new Store(100);

        // Create a bucket on given criteria
        System.out.println(store.search(2, 3, 30));

        // PaperDecorator for Flower TEST
        Flower flower = new Flower(10, 50, new int[]{255, 255, 155}, FlowerType.ROSE);
        System.out.println(new PaperDecorator(flower).getPrice());

        // RibbonDecorator for FlowerBucket TEST
        Flower bucketFlower = new Flower(10, 50, new int[]{255, 255, 155}, FlowerType.ROSE);
        FlowerPack bucketPack = new FlowerPack(bucketFlower, 100);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(bucketPack);

        System.out.println(new RibbonDecorator(flowerBucket).getPrice());
    }
}
