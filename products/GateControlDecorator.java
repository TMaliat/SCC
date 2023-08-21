package products;

// GateControlDecorator.java (Concrete Decorator)
public class GateControlDecorator extends CarDecorator {
    public GateControlDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    public String getDescription() {
        return decoratedCar.getDescription() + ", GateControl";
    }

    public double getCost() {
        return decoratedCar.getCost() + 700.0;
    }
}
