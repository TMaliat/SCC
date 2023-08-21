package products;

// RainShieldDecorator.java (Concrete Decorator)
public class RainShieldDecorator extends CarDecorator {
    public RainShieldDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    public String getDescription() {
        return decoratedCar.getDescription() + ", Rain Shield";
    }

    public double getCost() {
        return decoratedCar.getCost() + 500.0;
    }
}