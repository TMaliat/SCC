import notifications.*;

// Client.java
public class Client implements NotificationObserver {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public void update(NotificationType type) {
        System.out.println(name + " received notification: " + type);
    }

    public static void main(String[] args) {
        CarNotificationSubject subject = new CarNotificationSubject();

        Client client1 = new Client("Client 1");
        Client client2 = new Client("Client 2");

        subject.addObserver(client1);
        subject.addObserver(client2);

        // Trigger notifications
        subject.notifyObservers(NotificationType.PRICE_CHANGE);
        subject.notifyObservers(NotificationType.FEATURE_CHANGE);
    }
}
