package headfirst.designpatterns.combining.dfactory;

public interface AbstractDuckFactory {
    public Quackable createMallardDuck();
    public Quackable createRedheadDuck();
    public Quackable createRubberDuck();
    public Quackable createDuckCall();
}
