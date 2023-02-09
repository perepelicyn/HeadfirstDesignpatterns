package headfirst.designpatterns.combining.ecomposite;

public class MallardDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
    public String toString() {
        return "MallardDuck";
    }
}
