package headfirst.designpatterns.combining.ecomposite;

public class DuckCall implements Quackable{
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
    public String toString() {
        return "Duck Call";
    }
}
