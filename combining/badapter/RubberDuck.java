package headfirst.designpatterns.combining.badapter;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public String toString() {
        return "Rubber Duck";
    }
}
