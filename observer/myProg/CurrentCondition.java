package headfirst.designpatterns.observer.myProg;

public class CurrentCondition implements Observer{
    @Override
    public void update() {
        System.out.println("CurrentCondition: i'm get data");
    }
}
