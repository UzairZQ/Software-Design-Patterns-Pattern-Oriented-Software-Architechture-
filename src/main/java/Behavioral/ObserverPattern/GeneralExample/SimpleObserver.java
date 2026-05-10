package Behavioral.ObserverPattern.GeneralExample;

/**
 * OBSERVER PATTERN: A Concrete Observer
 */
public class SimpleObserver implements Observer {

    private int value;
    private Subject simpleSubject;

    public SimpleObserver(Subject simpleSubject){
        this.simpleSubject = simpleSubject;
        // Register this observer with the subject
        simpleSubject.registerObserver(this);
    }

    @Override
    public void update(int value){
        this.value = value;
        display();
    }

     public void display(){
        System.out.println("Current Value : "+ value);
     }
}
