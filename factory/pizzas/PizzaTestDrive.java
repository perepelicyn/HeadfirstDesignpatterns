package headfirst.designpatterns.factory.pizzas;

public class PizzaTestDrive {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore simplePizzaStore = new PizzaStore(factory);

        Pizza pizza = simplePizzaStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = simplePizzaStore.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

    }
}
