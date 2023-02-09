package headfirst.designpatterns.combining.fobserver;

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
        //Quackable goose = new GooseAdapter(new Goose());//new GooseFactoryAdapter().createGooseAdapter();

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        //flockOfDucks.add(goose);

        Flock flockOfMallards = new Flock();
        for(int i=0;i<5;i++)flockOfMallards.add(duckFactory.createMallardDuck());

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck simulator: With observer");
        QuackLogist quackLogist = new QuackLogist();
        flockOfDucks.registerObject(quackLogist);

        simulate(flockOfDucks);
        /*System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);*/

        System.out.println("Quack count:" + QuackCounter.getQuacks());
    }
    void simulate(Quackable duck){
        duck.quack();
    }
}
