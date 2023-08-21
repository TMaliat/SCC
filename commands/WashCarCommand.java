package commands;

// WashCarCommand.java
public class WashCarCommand implements Command {
    private String carId;

    public WashCarCommand(String carId) {
        this.carId = carId;
    }

    public void execute() {
        System.out.println("Washing car " + carId);
        // Perform washing logic
    }
}
