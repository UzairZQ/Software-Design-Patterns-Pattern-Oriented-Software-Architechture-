package Behavioral.TemplatePattern;

/**
 * TEMPLATE METHOD PATTERN: The Abstract Class
 * 
 * This class defines the "Template" for preparing a beverage.
 */
public abstract class CaffeineBeverage {

    /**
     * This is the TEMPLATE METHOD. 
     * It is marked 'final' so subclasses can't change the recipe steps.
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * These methods must be implemented by subclasses (Coffee/Tea).
     */
    abstract void brew();
    abstract void addCondiments();

    /**
     * These methods are shared by all beverages.
     */
    void boilWater() {
        System.out.println("Boiling water...");
    }

    void pourInCup() {
        System.out.println("Pouring into cup...");
    }
}
