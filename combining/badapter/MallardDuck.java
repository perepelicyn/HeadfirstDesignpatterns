package headfirst.designpatterns.combining.badapter;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
    public String toString() {
        return "MallardDuck";
    }
}
