package products;
import components.Chassis;

public class USAChassis implements Chassis {
    public void assemble() {
        System.out.println("USA Chassis assembling");
    }

    public void disassemble() {
        System.out.println("USA Chassis disassembling");
    }
}
