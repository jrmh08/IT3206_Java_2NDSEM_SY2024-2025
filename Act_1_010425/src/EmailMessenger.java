public class EmailMessenger implements Messenger{
    
    public void sendMessage(String message){
        System.out.println("Sending email: " + message);
    }
}