package factories;
import products.*;
// BMWFactory.java
public class BMWFactory extends CarGroupFactory {
    public CarVariant createRacingCar() {
        return new RacingCar();
    }

    public CarVariant createPrivateCar() {
        return new PrivateCar();
    }

    public CarVariant createSUV() {
        return new SUV();
    }

    public CarVariant createMilitaryVehicle() {
        return new MilitaryVehicle();
    }
}