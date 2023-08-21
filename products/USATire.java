package products;
import components.Tire;

public class USATire implements  Tire {
    public void inflate() {
        System.out.println("USA Tire inflating");
    }

    public void deflate() {
        System.out.println("USA Tire deflating");
    }
}
