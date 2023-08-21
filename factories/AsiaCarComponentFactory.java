// factories/AsiaCarComponentFactory.java
package factories;
import components.*;
import products.*;

public class AsiaCarComponentFactory implements CarComponentFactory {
    public Engine createEngine() {
        return new AsiaEngine();
    }

    public Tire createTire() {
        return new AsiaTire(); // Use fully qualified name here
    }

    public Chassis createChassis() {
        return new AsiaChassis();
    }

    public AC createAC() {
        return new AsiaAC();
    } 
}
