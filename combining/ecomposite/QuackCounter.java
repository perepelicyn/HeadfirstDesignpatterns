package headfirst.designpatterns.combining.ecomposite;

public class QuackCounter implements Quackable{
    Quackable duck;
    private static int counter;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        counter++;
        duck.quack();
    }

    public static int getQuacks() {
        return counter;
    }

    @Override
    public String toString() {
        return duck.toString();
    }

}
