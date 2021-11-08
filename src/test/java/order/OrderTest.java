package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import users.User;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order;
    User user;

    @BeforeEach
    void setUp() {
        order = new Order();
        user = new User();
        order.addUser(user);
    }

    @Test
    void addUser() {
        assertEquals(order.getUsers().size(), 1);
    }

    @Test
    void removeUser() {
        order.removeUser(user);
        assertEquals(order.getUsers().size(), 0);
    }


    @Test
    void order() {
        assertEquals(order.order(), true);
    }
}