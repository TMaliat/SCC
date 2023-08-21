// factories/USACarComponentFactory.java
package factories;
import components.*;
import products.*;

public class USACarComponentFactory implements CarComponentFactory {
    public Engine createEngine() {
        return new USAEngine();
    }

    public Tire createTire() {
        return new USATire();
    }

    public Chassis createChassis() {
        return new USAChassis();
    }

    public AC createAC() {
        return new USAAC();
    }
}