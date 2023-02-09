package headfirst.designpatterns.combining.abase;

public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
    public String toString() {
        return "Redhead Duck";
    }
}
