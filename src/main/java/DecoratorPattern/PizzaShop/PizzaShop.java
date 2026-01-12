package DecoratorPattern.PizzaShop;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza mythinPizza = new ThinCrustPizza();
        
        mythinPizza = new Cheese(mythinPizza);
        mythinPizza = new Pepper(mythinPizza);
        mythinPizza = new Olives(mythinPizza);


System.out.println(mythinPizza.getDescription() + " $ " + mythinPizza.cost());

    }
    
}
