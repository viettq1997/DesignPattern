package behaviorDesignPattern.observerDesignPattern.New.Base;

import java.util.ArrayList;
import java.util.List;

/**
 * Thực hiện tạo Subject để VideoData extend
 */
public class Subject {
    /**
     * Khởi tạo List<IObserver> 
     */
    private final List<Observer> observers = new ArrayList<Observer>();

    public void attachObserver(Observer iObserver) {
        observers.add(iObserver);
    }

    public void detachObserver(Observer iObserver) {
        observers.remove(iObserver);
    }

    public void NotifyObserver(Object arg) {
        for (Observer iObserver : observers) {
            iObserver.Notify(arg);
        }
    }
}
