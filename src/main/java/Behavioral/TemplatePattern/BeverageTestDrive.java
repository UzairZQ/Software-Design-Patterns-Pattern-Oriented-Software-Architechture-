package Behavioral.TemplatePattern;

/**
 * TEMPLATE METHOD PATTERN: The Test Drive
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        Coffee myCoffee = new Coffee();

        System.out.println("Making tea...");
        myTea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        myCoffee.prepareRecipe();
    }
}
