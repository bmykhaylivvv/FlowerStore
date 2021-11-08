package users;

public class User {
    public static int count=0;
    public int userId;

    public User() {
        userId = User.count;
        User.count++;
    }

    public boolean update(Status status) {
        System.out.println("Order status has been updated to " + status);
        return true;
    }
}
