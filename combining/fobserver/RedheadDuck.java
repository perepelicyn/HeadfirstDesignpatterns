package headfirst.designpatterns.combining.fobserver;

public class RedheadDuck implements Quackable {
    Observable observable;
    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    public RedheadDuck() {
        observable = new Observable(this);
    }

    public String toString() {
        return "Redhead Duck";
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
