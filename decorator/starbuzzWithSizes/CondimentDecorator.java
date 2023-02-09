package headfirst.designpatterns.decorator.starbuzzWithSizes;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
