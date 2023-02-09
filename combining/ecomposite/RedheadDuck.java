package headfirst.designpatterns.combining.ecomposite;

public class RedheadDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
    public String toString() {
        return "Redhead Duck";
    }
}
