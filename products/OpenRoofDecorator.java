package products;

// OpenRoofDecorator.java (Concrete Decorator)
public class OpenRoofDecorator extends CarDecorator {
    public OpenRoofDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    public String getDescription() {
        return decoratedCar.getDescription() + ", Open Roof";
    }

    public double getCost() {
        return decoratedCar.getCost() + 800.0;
    }
}
