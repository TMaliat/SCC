package products;

// BasicCar.java (Concrete Component)
public class BasicCar implements Car {
    public String getDescription() {
        return "Basic Car";
    }

    public double getCost() {
        return 10000.0;
    }
}