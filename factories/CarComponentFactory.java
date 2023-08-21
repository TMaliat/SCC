// factories/CarComponentFactory.java
package factories;
import components.*;

public interface CarComponentFactory {
    Engine createEngine();
    Tire createTire();
    Chassis createChassis();
    AC createAC();
}