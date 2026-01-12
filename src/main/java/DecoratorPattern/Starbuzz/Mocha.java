package DecoratorPattern.Starbuzz;

public class Mocha extends CondimentDecorator {

    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
return " Mocha " + beverage.getDescription();
    }

    @Override
    public double cost(){
            return beverage.cost() + .20;
    }

    
}

