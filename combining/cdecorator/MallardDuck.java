package headfirst.designpatterns.combining.cdecorator;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
    public String toString() {
        return "MallardDuck";
    }
}
