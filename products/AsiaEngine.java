

// products/AsiaEngine.java
package products;
import components.Engine;

public class AsiaEngine implements Engine {
    public void start() {
        System.out.println("Asia Engine starting");
    }

    public void stop() {
        System.out.println("Asia Engine stopping");
    }
}

// Similar classes for AsiaTire, AsiaChassis, AsiaAC, USAEngine, USATire, USAChassis, USAAC
