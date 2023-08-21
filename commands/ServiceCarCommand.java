package commands;

// ServiceCarCommand.java
public class ServiceCarCommand implements Command {
    private String carId;

    public ServiceCarCommand(String carId) {
        this.carId = carId;
    }

    public void execute() {
        System.out.println("Servicing car " + carId);
        // Perform servicing logic
    }
}
