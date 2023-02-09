package headfirst.designpatterns.combining.fobserver;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createDuckCall();
}
