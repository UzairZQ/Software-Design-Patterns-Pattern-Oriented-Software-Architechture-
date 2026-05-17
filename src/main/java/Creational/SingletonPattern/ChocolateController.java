package Creational.SingletonPattern;

public class ChocolateController {
    public static void main(String[] args) {
        
        System.out.println("--- Starting the Factory ---");
        
        // Let's get the boiler instance
        ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
        boiler1.fill();
        boiler1.boil();
        boiler1.drain();

        System.out.println("\n--- Asking for another boiler ---");
        
        // Let's try to get another boiler
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        
        System.out.println("\n--- Checking Instances ---");
        // Let's see if they are the exact same object in memory
        if (boiler1 == boiler2) {
            System.out.println("SUCCESS: boiler1 and boiler2 are the exact same object!");
        } else {
            System.out.println("FAIL: We have two different boilers.");
        }
    }
}
