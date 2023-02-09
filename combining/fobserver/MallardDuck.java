package headfirst.designpatterns.combining.fobserver;

public class MallardDuck implements Quackable {
    Observable observable;

    public MallardDuck() {
        observable=new Observable(this);
    }
    @Override
    public void quack(){
        System.out.println("Quack");
        notifyObservers();
    }
    public String toString() {
        return "MallardDuck";
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
