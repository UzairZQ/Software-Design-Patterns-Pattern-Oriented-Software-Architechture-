package DecoratorPattern.PizzaShop;

public class ThickCrustPizza  extends Pizza {

    public ThickCrustPizza() {
        description = "Thick Crust Pizza";
    }

    public String getDescription(){
        return description;
    }

    public double cost(){
        return 7.99;
    }
    
}
