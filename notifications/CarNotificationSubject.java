package notifications;
import java.util.ArrayList;
import java.util.List;


// CarNotificationSubject.java (Concrete Subject)
public class CarNotificationSubject implements NotificationSubject {
    private List<NotificationObserver> observers = new ArrayList<>();

    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(NotificationType type) {
        for (NotificationObserver observer : observers) {
            observer.update(type);
        }
    }

    // Other methods related to notifications
}