public class NotificationService {
    private final Messenger messenger;

    public NotificationService(Messenger messenger){ //constructor
        this.messenger = messenger;
    }

    public void notifyUser(String message){
        messenger.sendMessage(message); //any string inside the message variable will be passed to the interface
    }
}
