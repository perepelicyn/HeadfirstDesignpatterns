package headfirst.designpatterns.composite.menuIteratorMy;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;
    Iterator<MenuComponent> iterator = null;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
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
    public Iterator<MenuComponent> getIterator() {
        if (iterator==null)
            iterator = new MenuIterator(menuComponents.iterator());
        return iterator;
    }

    public void print() {
        System.out.println(getName() + " " + getDescription());
        System.out.println("-----------------");
        for(MenuComponent menuComponent: menuComponents){
            menuComponent.print();
        }
        System.out.println("----end " + getName() );
    }

}
