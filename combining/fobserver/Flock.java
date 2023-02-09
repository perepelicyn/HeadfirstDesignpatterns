package headfirst.designpatterns.combining.fobserver;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList<Quackable> ducks = new ArrayList<Quackable>();
    public void add(Quackable element){
        ducks.add(element);

    }
    @Override
    public void quack() {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    public void registerObject(Observer observer){
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()){
            Quackable duck = iterator.next();
            duck.registerObject(observer);
        }
    }

    @Override
    public void notifyObservers() {}
}
