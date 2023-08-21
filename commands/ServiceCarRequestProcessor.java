package commands;

// ServiceCarRequestProcessor.java (Concrete Template)
public class ServiceCarRequestProcessor extends RequestProcessor {
    protected void approveRequest() {
        System.out.println("Car servicing request approved");
    }

    protected void performRequest() {
        System.out.println("Performing car servicing");
        // Perform servicing logic
    }

    protected void finalizeRequest() {
        System.out.println("Car servicing completed");
    }
}
