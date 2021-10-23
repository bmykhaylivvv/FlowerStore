import FlowerStore.Flower;
import FlowerStore.FlowerType;

public class Main {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];
        int[] color = {128, 128, 128};
        for (int i = 0; i < flowers.length; i++) {
            flowers[i] = new Flower(FlowerType.ROSE);
            flowers[i].setColor(color);
            System.out.println(flowers[i]);
        }
    }
}
