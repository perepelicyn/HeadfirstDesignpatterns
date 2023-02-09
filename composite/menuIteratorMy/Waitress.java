package headfirst.designpatterns.composite.menuIteratorMy;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
    public void printVegetarianMenu(){
        Iterator<MenuComponent> iterator = allMenus.getIterator();
        if(iterator!=null) {
            while (iterator.hasNext()) {
                MenuComponent menuComponent = iterator.next();
                //menuComponent.print();
                try {
                    if (menuComponent.isVegetarian()) {
                        menuComponent.print();
                    }
                } catch (UnsupportedOperationException e) {
                }
            }
        }

    }

}
