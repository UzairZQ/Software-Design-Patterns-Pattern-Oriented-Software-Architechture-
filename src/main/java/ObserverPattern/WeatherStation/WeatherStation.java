package ObserverPattern.WeatherStation;

import java.util.ArrayList;

public class WeatherStation implements WeatherStationInterface {

   private double temperature;
    private double windSpeed;
   private double pressure;

   private ArrayList<Observer> observers;

   public WeatherStation(){
    observers = new ArrayList<Observer>();
   }

   public void registerObserver(Observer o){
       observers.add(o);
       // give the newly registered observer the current state immediately
       o.updateTemp(this.temperature);
       o.updateWindSpeed(this.windSpeed);
       o.updatePressure(this.pressure);
   }
   public void removeObserver(Observer o){
       observers.remove(o);
   }
   public void notifyObservers(){

    for (Observer observer: observers ){
        observer.updateTemp(this.temperature);
        observer.updateWindSpeed(this.windSpeed);
        observer.updatePressure(this.pressure);
    }

    }
     public void setTemp(double temp){
        this.temperature = temp;
        notifyObservers();
   }
public void setWindSpeed(double wind){
        this.windSpeed = wind;
        notifyObservers();
   }

   public void setPressure(double pressure){
        this.pressure = pressure;
        notifyObservers();
   }
    
}
