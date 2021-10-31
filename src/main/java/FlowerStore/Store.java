package FlowerStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Store {
    private int flowersNum;
    private List<Flower> storeFlowers = new ArrayList<Flower>();
    private static Random rnd = new Random(); // for further random

    public Store(int flowersNum) {
        this.flowersNum = flowersNum;
        for (int i = 0; i < flowersNum; i++) {
            storeFlowers.add(generateFlower());
        }
    }

    private Flower generateFlower() {
        int randomSepalLength = rnd.nextInt(11) + 1;
        int randomPrice = rnd.nextInt(51) + 12;
        int[] randomColor = {rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)};
        FlowerType[] flowerTypes = {FlowerType.ROSE,  FlowerType.TULIP, FlowerType.CHAMOMILE };
        FlowerType randomFlowerType = flowerTypes[rnd.nextInt(3)];

        Flower randomFlower = new Flower(randomPrice, randomSepalLength, randomColor, randomFlowerType);
        return randomFlower;
    }

    public FlowerBucket search(int numOfFlowersInBucket, double sepalLength, double oneFlowerPrice) {
        int flowersInBucket = 0;
        int invalidLoops = 0;
        FlowerBucket searchFlowerBucket = new FlowerBucket();

        while (flowersInBucket != numOfFlowersInBucket) {
            Flower randomFlower = storeFlowers.get(rnd.nextInt(storeFlowers.size()));
            if (invalidLoops == storeFlowers.size()) {
                System.out.println("No flowers in stock to full a bucket for your :(");
                return searchFlowerBucket;
            }

            if (randomFlower.getPrice() < oneFlowerPrice && randomFlower.getSepalLength() == sepalLength) {
                FlowerPack oneFlowerPack = new FlowerPack(randomFlower, 1);
                searchFlowerBucket.addFlowerPack(oneFlowerPack);

                storeFlowers.remove(randomFlower);
                flowersInBucket++;
            } else {
                invalidLoops++;
                continue;
            }
        }

        if (flowersInBucket == numOfFlowersInBucket) {
            System.out.println("You bucket is waiting for you under the price;) \nPrice: " + searchFlowerBucket.getPrice() + "\n");
        }

        return searchFlowerBucket;
    };

    public List<Flower> getStoreFlowers() {
        return storeFlowers;
    }
}
