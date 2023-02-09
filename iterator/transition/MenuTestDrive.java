package headfirst.designpatterns.iterator.transition;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        ArrayList<Menu> arrayList = new ArrayList<Menu>();
        arrayList.add(pancakeHouseMenu);
        arrayList.add(dinerMenu);
        Waitress waitress = new Waitress(arrayList);
        waitress.printMenu();
    }
}
