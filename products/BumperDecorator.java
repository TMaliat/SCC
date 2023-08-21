package products;

// BumperDecorator.java (Concrete Decorator)
public class BumperDecorator extends CarDecorator {
    public BumperDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    public String getDescription() {
        return decoratedCar.getDescription() + ", Bumper";
    }

    public double getCost() {
        return decoratedCar.getCost() + 600.0;
    }
}
