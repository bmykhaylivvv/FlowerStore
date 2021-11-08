package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    Sender sender;

    @BeforeEach
    void setUp() {
        sender = new Sender();
    }

    @Test
    void updateSender() {
        assertEquals(sender.update(Status.PROCESSING), true);
    }
}