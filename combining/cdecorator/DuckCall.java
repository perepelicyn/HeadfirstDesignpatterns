package headfirst.designpatterns.combining.cdecorator;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
    public String toString() {
        return "Duck Call";
    }
}
