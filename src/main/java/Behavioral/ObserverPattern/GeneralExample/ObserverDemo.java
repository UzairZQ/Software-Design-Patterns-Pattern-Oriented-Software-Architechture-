package Behavioral.ObserverPattern.GeneralExample;

/**
 * OBSERVER PATTERN: The Simulator
 */
public class ObserverDemo {
    public static void main(String[] args) {
        // 1. Create a subject
        SimpleSubject subject = new SimpleSubject();

        // 2. Create observers
        SimpleObserver o1 = new SimpleObserver(subject);
        SimpleObserver o2 = new SimpleObserver(subject);

        // 3. Change values and see observers react
        System.out.println("Updating value to 10...");
        subject.setValue(10);
        
        System.out.println("\nUpdating value to 20...");
        subject.setValue(20);

        // 4. Demonstrate removal
        System.out.println("\nRemoving first observer and updating to 30...");
        subject.removeObserver(o1);
        subject.setValue(30);
    }
}
