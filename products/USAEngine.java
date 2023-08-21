package products;
import components.Engine;

public class USAEngine implements Engine {
    public void start() {
        System.out.println("USA Engine starting");
    }

    public void stop() {
        System.out.println("USA Engine stopping");
    }
}
