package headfirst.designpatterns.combining.ecomposite;

public class GooseAdapter implements Quackable{
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public String toString() {
        return "Goose adapter "+goose.toString();
    }
}
