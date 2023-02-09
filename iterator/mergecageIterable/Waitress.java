package headfirst.designpatterns.iterator.mergecageIterable;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    DinerMenu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, DinerMenu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        System.out.println("\nDINNER");
        printMenu(cafeIterator);
        System.out.println("\nLUNCH");
        printMenuIterable(dinerMenu);
    }
    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    private void printMenuIterable(Iterable<MenuItem> iterator) {
        System.out.println("-------------PRINT ITERABLE METHOD-----------");
        for(MenuItem item: iterator) {
                System.out.print(item.getName() + ", ");
                System.out.print(item.getPrice() + " -- ");
                System.out.println(item.getDescription());
        }
    }

    public void printVegetarianMenu() {
        System.out.println("\nVEGETARIAN MENU\n---------------");
        printVegetarianMenu(pancakeHouseMenu.createIterator());
        printVegetarianMenu(dinerMenu.createIterator());
        printVegetarianMenu(cafeMenu.createIterator());
    }

    private void printVegetarianMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (menuItem.isVegetarian()) {
                System.out.print(menuItem.getName() + ", ");
                System.out.print(menuItem.getPrice() + " -- ");
                System.out.println(menuItem.getDescription());
            }
        }
    }


}
