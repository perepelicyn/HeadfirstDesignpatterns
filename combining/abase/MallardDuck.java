package headfirst.designpatterns.combining.abase;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
    public String toString() {
        return "MallardDuck";
    }
}
