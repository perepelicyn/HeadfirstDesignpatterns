package headfirst.designpatterns.combining.ecomposite;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        simulator.simulate(countingDuckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory){
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck= duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());//new GooseFactoryAdapter().createGooseAdapter();

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);

        Flock flockOfMallards = new Flock();
        for(int i=0;i<5;i++)flockOfMallards.add(duckFactory.createMallardDuck());

        flockOfDucks.add(flockOfMallards);
        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("Quack count:" + QuackCounter.getQuacks());
    }
    void simulate(Quackable duck){
        duck.quack();
    }
}
