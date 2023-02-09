package headfirst.designpatterns.combining.fobserver;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return null /*new DuckCall()*/;
    }
}
