package headfirst.designpatterns.combining.fobserver;

public class QuackLogist implements Observer{
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quack logist: "+duck+" just quacked");
    }
}
