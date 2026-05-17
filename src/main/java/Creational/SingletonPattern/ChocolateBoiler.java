package Creational.SingletonPattern;

/**
 * SINGLETON PATTERN
 * 
 * This class ensures that only ONE instance of the ChocolateBoiler
 * can ever exist in the Java Virtual Machine.
 * 
 * We are using "Double-Checked Locking" to make it Thread-Safe
 * without slowing down the application every time we call getInstance().
 */
public class ChocolateBoiler {
    
    private boolean empty;
    private boolean boiled;

    // 1. The volatile keyword ensures that multiple threads handle the 
    // uniqueInstance variable correctly when it is being initialized.
    private volatile static ChocolateBoiler uniqueInstance;

    // 2. PRIVATE constructor! Only this class can instantiate itself.
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    // 3. The global point of access.
    public static ChocolateBoiler getInstance() {
        // Check 1: If the instance doesn't exist, we might need to create it.
        if (uniqueInstance == null) {
            
            // Only synchronize the block where we create the object.
            // This happens only once!
            synchronized (ChocolateBoiler.class) {
                
                // Check 2: Once in the block, check again to make sure 
                // another thread didn't create it while we were waiting.
                if (uniqueInstance == null) {
                    System.out.println("Creating unique instance of Chocolate Boiler...");
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        System.out.println("Returning instance of Chocolate Boiler...");
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Filling the boiler with a milk/chocolate mixture.");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("Draining the boiled chocolate and milk.");
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("Boiling the mixture.");
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
