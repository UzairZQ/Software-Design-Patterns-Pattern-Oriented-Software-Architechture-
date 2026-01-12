package DecoratorPattern.PizzaShop;

public class ThinCrustPizza extends Pizza{

    public ThinCrustPizza() {
        description = "Thin Crust Pizza";
    }
 public String getDescription(){
return description;
    }

    public double cost(){
        return 4.99;
    }
}
