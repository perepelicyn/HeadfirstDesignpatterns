package headfirst.designpatterns.combining.fobserver;

public class Goose {
    public void honk() {
        System.out.println("Honk");
    }

    @Override
    public String toString() {
        return "Goose";
    }
}