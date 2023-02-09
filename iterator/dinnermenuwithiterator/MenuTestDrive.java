package headfirst.designpatterns.iterator.dinnermenuwithiterator;

import java.util.Iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Iterator<MenuItem> dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
