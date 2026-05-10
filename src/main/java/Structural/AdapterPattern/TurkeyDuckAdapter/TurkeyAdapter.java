package Structural.AdapterPattern.TurkeyDuckAdapter;

/**
 * ADAPTER PATTERN: The Adapter
 * 
 * The job of an Adapter is to convert the interface of a class into 
 * another interface that the client expects.
 * 
 * Here, we want a Turkey to act like a Duck.
 */
public class TurkeyAdapter implements Duck {

    // The Adapter wraps the object it is adapting (the Turkey)
    Turkey turkey;
    
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    /**
     * When the client calls quack(), the adapter translates this 
     * call into a gobble() for the turkey.
     */
    public void quack(){
        turkey.gobble();
    }

    /**
     * Turkeys fly in short bursts, while ducks fly longer distances.
     * The adapter compensates for this by calling the turkey's fly() method 5 times.
     */
    public void fly(){
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
