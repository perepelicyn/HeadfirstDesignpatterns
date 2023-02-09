package headfirst.designpatterns.combining.fobserver;

public class QuackCounter implements Quackable {

    Quackable duck;
    private static int counter;
    Observable observable;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        counter++;
        duck.quack();
        notifyObservers();
    }

    public static int getQuacks() {
        return counter;
    }

    @Override
    public String toString() {
        return duck.toString();
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
