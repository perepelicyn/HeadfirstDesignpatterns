package headfirst.designpatterns.combining.fobserver;

public class RubberDuck implements Quackable {
    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Rubber Duck";
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
