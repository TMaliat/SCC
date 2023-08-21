package notifications;

// NotificationSubject.java
public interface NotificationSubject {
    void addObserver(NotificationObserver observer);
    void removeObserver(NotificationObserver observer);
    void notifyObservers(NotificationType type);
}