package headfirst.designpatterns.observer.myProg;

public class StatisticDisplay implements Observer{
    @Override
    public void update() {
        System.out.println("StatisticDisplay: i'm get data");
    }
}
