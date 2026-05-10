package Behavioral.ObserverPattern.WeatherStation;

/**
 * OBSERVER PATTERN: The Simulator
 * 
 * This class ties everything together. We create a Subject (WeatherStation) 
 * and multiple Observers (UI, Logger, Alert).
 */
public class WeatherSimulation {
    public static void main(String[] args) {
        // 1. Create the Subject
        WeatherStation station = new WeatherStation();

        // 2. Create the Observers (they register themselves in their constructors)
        UserInterface ui = new UserInterface(station);
        Logger logger = new Logger(station);
        Alert alert = new Alert(station);

        // 3. Change the state of the Subject. All observers will be notified!
        System.out.println("--- Initial updates ---");
        station.setTemp(25.0);
        station.setWindSpeed(5.0);
        station.setPressure(1013.0);

        System.out.println("\n--- Weather changes (alerts expected) ---");
        station.setTemp(36.0); // trigger high temp alert
        station.setWindSpeed(25.0); // trigger wind alert
        station.setPressure(970.0); // trigger low pressure alert

        // 4. Demonstrate dynamic removal
        System.out.println("\n--- Removing Logger and changing temp ---");
        station.removeObserver(logger);
        station.setTemp(30.0); // logger won't log this, but UI will still update!
    }
}
