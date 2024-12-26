package ObserverPatExample;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private final List<Observer> observerList;

    public Observable() {
        observerList = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }
}
