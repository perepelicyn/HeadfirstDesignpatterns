package headfirst.designpatterns.combining.ecomposite;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{
    ArrayList<Quackable> quackers = new ArrayList<Quackable>();
    public void add(Quackable element){
        quackers.add(element);
    }
    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }

    }
}
