package Behavioral.ObserverPattern.GeneralExample;

import java.util.ArrayList;

/**
 * OBSERVER PATTERN: A Concrete Subject
 */
public class SimpleSubject implements Subject {

    private ArrayList<Observer> observers;
    private int value = 0;

    public SimpleSubject() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }
    
    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(value);
        }
    }

    public void setValue(int value){
        this.value = value;
        // Notify observers whenever the value changes
        notifyObservers();
    }
}
