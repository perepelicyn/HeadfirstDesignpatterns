package headfirst.designpatterns.decorator.starbuzzWithSizes;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$"+String.format("%.2f",beverage.cost()));

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + String.format("%.2f", beverage2.cost()));

        Beverage beverage3 = new DarkRoast();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + String.format("%.2f", beverage3.cost()));
    }
}
