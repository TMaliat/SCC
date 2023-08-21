package products;
import components.AC;

public class USAAC implements AC {
    public void cool() {
        System.out.println("USA AC turning on");
    }

    public void heat() {
        System.out.println("USA AC turning off");
    }
}
