package headfirst.designpatterns.combining.ecomposite;

public class GooseFactoryAdapter extends AbstractGooseFactory{
    @Override
    public Goose createGoose() {
        return new Goose();
    }

    @Override
    public Quackable createGooseAdapter() {
        return new GooseAdapter(new Goose());
    }
}
