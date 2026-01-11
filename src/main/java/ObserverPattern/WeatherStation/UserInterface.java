package ObserverPattern.WeatherStation;


public class UserInterface implements Observer{
    private double temperature;
    private double windSpeed;
    private double pressure;

    public UserInterface(WeatherStationInterface weatherStation){
        weatherStation.registerObserver(this);
    }

    @Override
    public void updateTemp(double value){
        this.temperature = value;
        display();
    }

    @Override
    public void updateWindSpeed(double value){
        this.windSpeed = value;
        display();
    }

    @Override
    public void updatePressure(double value){
        this.pressure = value;
        display();
    }

    public void display(){
        System.out.println(String.format("UI -> Temp: %.1f °C, Wind: %.1f m/s, Pressure: %.1f hPa", temperature, windSpeed, pressure));
    }
}
