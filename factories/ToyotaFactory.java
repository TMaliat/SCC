package factories;
import products.*;
// ToyotaFactory.java
public class ToyotaFactory extends CarGroupFactory {
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