package headfirst.designpatterns.observer.myProg;

public class ForecastDisplay implements Observer{
    @Override
    public void update() {
        System.out.println("ForecastDisplay: i'm get data");
    }
}
