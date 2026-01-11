package ObserverPattern.WeatherStation;

public class WeatherSimulation {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        UserInterface ui = new UserInterface(station);
        Logger logger = new Logger(station);
        Alert alert = new Alert(station);

        System.out.println("--- Initial updates ---");
        station.setTemp(25.0);
        station.setWindSpeed(5.0);
        station.setPressure(1013.0);

        System.out.println("--- Weather changes (alerts expected) ---");
        station.setTemp(36.0); // trigger high temp alert
        station.setWindSpeed(25.0); // trigger wind alert
        station.setPressure(970.0); // trigger low pressure alert

        System.out.println("--- Removing Logger and changing temp ---");
        station.removeObserver(logger);
        station.setTemp(30.0); // logger won't log this
    }
}
