package order;

import users.Status;
import users.User;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<User> users;

    public Order() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void notifyUsers(Status status) {
        for (User user : users) {
            user.update(status);
        }
    }

    public boolean order() {
        System.out.println("Order is processing");
        notifyUsers(Status.PROCESSING);
        return true;
    }
}
