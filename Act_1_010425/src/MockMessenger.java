public class MockMessenger implements Messenger{ //the Messenger interface is used again, but for the mock tests

    public void sendMessage(String message){
        System.out.println("Mock Email sent: " + message);
    }
}