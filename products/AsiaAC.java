package products;
import components.AC;

public class AsiaAC implements AC {
    public void cool() {
        System.out.println("Asia AC turning on");
    }

    public void heat() {
        System.out.println("Asia AC turning off");
    }
}
