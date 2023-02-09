package headfirst.designpatterns.combining.fobserver;

public class DuckCall implements Quackable {
    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }
    public String toString() {
        return "Duck Call";
    }

    @Override
    public void registerObject(Observer observer) {
        observable.registerObject(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
