package headfirst.designpatterns.builder.house;

public class HouseDirector {
    public static void main(String[] args) {
        HouseBuilder woodHouseBuilder = new WoodHouseBuilder();
        House woodHouse = woodHouseBuilder.addWalls().addWindows().addRoof().build();
        System.out.println(woodHouse);

        HouseBuilder gingerbreadHouseBuilder = new GingerbreadHouseBuilder();
        House gingerbreadHouse = gingerbreadHouseBuilder.addWalls().addWindows().addRoof().build();
        System.out.println(gingerbreadHouse);
    }
}
