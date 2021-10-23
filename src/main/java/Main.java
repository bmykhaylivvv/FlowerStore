import FlowerStore.Store;

public class Main {
    public static void main(String[] args) {
        // Create a store which contains flowersNum flowers
        Store store = new Store(100);

        // Create a bucket on given criteria
        System.out.println(store.search(2, 3, 30));
    }
}
