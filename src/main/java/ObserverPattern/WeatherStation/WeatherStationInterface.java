package ObserverPattern.WeatherStation;

public interface WeatherStationInterface {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
