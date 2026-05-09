package AdapterPattern.TurkeyDuckAdapter;

/**
 * ADAPTER PATTERN: A Concrete Target
 * 
 * This is a standard Duck that already implements the interface we want.
 */
public class MallardDuck implements Duck {
    public void fly(){
        System.out.println("Mallard Duck is flying");
    }

    public void quack(){
        System.out.println("Mallard Duck is quacking");
    }
}
