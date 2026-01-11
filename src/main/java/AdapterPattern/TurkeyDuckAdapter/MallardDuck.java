package AdapterPattern.TurkeyDuckAdapter;

public class MallardDuck implements Duck {
    public void fly(){

        System.out.println("Mallard Duck is flying");
    }

    public void quack(){

        System.out.println("Mallard Duck is quacking");
    }
}
