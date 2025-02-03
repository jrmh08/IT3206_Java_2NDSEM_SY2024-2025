public class NotificationService {
    private final Messenger messenger;

    public NotificationService(Messenger messenger){
        this.messenger = messenger;
    }

    public void notifyUser(String message){
        messenger.sendMessage(message);
    }
}
