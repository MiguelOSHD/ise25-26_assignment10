package de.seuhd.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    // TODO: Add fields.
    private final List<Observer> observers = new ArrayList();
    private int value;

    void attach(Observer observer) {
        // TODO: Implement attach method.
        if (observer != null) {
            observers.add(observer);
        }
    }

    void detach(Observer observer) {
        // TODO: Implement detach method.
        observers.remove(observer);
    }


    public void setValue(int newValue) {
        value = newValue;
        System.out.println("Value of subject updated to " + newValue);
        notifyObservers();
    }

    public int getValue() {
        return value;
    }

    protected void notifyObservers() {
        // TODO: Implement fireUpdate method.
        System.out.println("Sending update to observers ...");

        for(Observer observer : observers) {
            observer.update(this);
        }
    }
}
