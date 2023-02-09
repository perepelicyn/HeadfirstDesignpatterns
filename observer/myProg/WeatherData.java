package headfirst.designpatterns.observer.myProg;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class WeatherData {
    private int temperature;
    private int humidity; //влажность
    private int pressure; //давление
    Set<Observer> objects;
    Random rnd = new Random();

    public WeatherData() {
        temperature = 0;
        humidity = 60;
        pressure = 760;
        objects = new LinkedHashSet<Observer>();
    }

    public void changeTemperature(){
        int delta=0;
        if (rnd.nextInt(10)%2 == 1)
            delta=-1;
        else
            delta = 1;
        if ((temperature+delta)>=-45 && (temperature+delta)<=45) temperature = temperature+delta;
    }
    public void changeHymidity(){
        int delta=0;
        if (rnd.nextInt(10)%2 == 1)
            delta=-1;
        else
            delta = 1;
        if ((humidity+delta)>0 && (humidity+delta)<100) humidity = humidity+delta;
    }
    public void changePressure(){
        int delta=0;
        if (rnd.nextInt(10)%2 == 1)
            delta=-1;
        else
            delta = 1;
        if ((pressure+delta)>=720 && (pressure+delta)<=900) pressure = pressure+delta;
    }

    public void measurementsChanged(){
        //вызываем для фактического изменения параметров
        changeTemperature();
        changeHymidity();
        changePressure();

        notifyObservers();
    }

    public void addObserver(Observer o){
        objects.add(o);
    }
    public void deleteObserver(Observer o){
        objects.remove(o);
    }
    public void notifyObservers(){
        for (Observer o: objects) {
            o.update();
        }

    }



    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        Observer o1 = new CurrentCondition();
        Observer o2 = new CurrentCondition();
        Observer o3 = new ForecastDisplay();
        Observer o4 = new StatisticDisplay();

        wd.addObserver(o1);
        wd.addObserver(o2);
        wd.addObserver(o3);
        wd.addObserver(o4);

        wd.deleteObserver(o2);
        wd.measurementsChanged();
        System.out.println("------------");
        wd.measurementsChanged();
    }

}
