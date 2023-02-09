package headfirst.designpatterns.combining.ecomposite;

public abstract class AbstractGooseFactory {
    public abstract Goose createGoose();
    public abstract Quackable createGooseAdapter();
}
