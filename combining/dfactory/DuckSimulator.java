package headfirst.designpatterns.combining.dfactory;

public class DuckSimulator {
    AbstractDuckFactory duckFactory;
    public static void main(String[] args) {
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n===Duck Simulator: with AbstractFactory===");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked "+QuackCounter.getQuacks());
    }
    void simulate(Quackable duck){
        duck.quack();
    }
}
