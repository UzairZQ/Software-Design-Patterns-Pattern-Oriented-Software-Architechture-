package DecoratorPattern.PizzaShop;

/**
 * DECORATOR PATTERN: A Concrete Component
 */
public class ThickCrustPizza extends Pizza {

    public ThickCrustPizza() {
        description = "Thick Crust Pizza";
    }

    public double cost(){
        return 7.99;
    }
}
