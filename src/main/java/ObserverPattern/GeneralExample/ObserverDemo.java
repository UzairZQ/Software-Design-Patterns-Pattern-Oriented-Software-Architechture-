package ObserverPattern.GeneralExample;

public class ObserverDemo {
    public static void main(String[] args) {
        SimpleSubject subject = new SimpleSubject();
        SimpleObserver o1 = new SimpleObserver(subject);
        SimpleObserver o2 = new SimpleObserver(subject);

        subject.setValue(10);
        subject.setValue(20);

        subject.removeObserver(o1);

        subject.setValue(30);
    }
}
