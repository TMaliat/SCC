package factories;

import products.CarVariant;

public abstract class CarGroupFactory {
    public abstract CarVariant createRacingCar();
    public abstract CarVariant createPrivateCar();
    public abstract CarVariant createSUV();
    public abstract CarVariant createMilitaryVehicle();
}
