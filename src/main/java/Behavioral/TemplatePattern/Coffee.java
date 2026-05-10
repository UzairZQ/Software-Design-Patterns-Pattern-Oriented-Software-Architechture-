package Behavioral.TemplatePattern;

/**
 * TEMPLATE METHOD PATTERN: A Concrete Implementation
 */
public class Coffee extends CaffeineBeverage {
    
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk...");
    }
}
