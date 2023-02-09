package headfirst.designpatterns.composite.menuIteratorMy;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price)
    {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public Iterator<MenuComponent> getIterator() {
        return new Iterator<MenuComponent>(){
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public MenuComponent next() {
                return null;
            }
        };
    }

    @Override
    public void print() {
        System.out.print(getName()+" "+description+" \n");
        //if(isVegetarian()) System.out.print("(v)");
        System.out.println(" , "+getPrice());
        System.out.println(" -- "+getDescription());
    }
}
