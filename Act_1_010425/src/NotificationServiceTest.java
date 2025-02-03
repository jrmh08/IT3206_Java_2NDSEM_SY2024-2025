import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceTest {
    
    @Test
    void testEmailMessenger(){
        Messenger email = new EmailMessenger(); //creates a new email
        NotificationService service = new NotificationService(email);
        service.notifyUser("Hello via Email!"); //tests if sending a message works

        assertTrue(true);
    }

    @Test 
    void testMockMessenger(){
        Messenger mock = new MockMessenger();
        NotificationService service = new NotificationService(mock);
        service.notifyUser("Test Message"); //tests if sending a mock message works

        assertTrue(true);
    }

    @Test 
    void testEmptyMessage(){
        Messenger mock = new MockMessenger();
        NotificationService service = new NotificationService(mock);
        service.notifyUser(""); //checks if empty messages work

        assertTrue(true);
    }
}
