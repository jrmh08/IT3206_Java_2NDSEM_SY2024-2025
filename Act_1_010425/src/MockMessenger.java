public class MockMessenger implements Messenger{

    public void sendMessage(String message){
        System.out.println("Mock Email sent: " + message);
    }
}