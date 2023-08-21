package integration;

// MobileAppFacade.java (Facade)
public class MobileAppFacade {
    private WebBasedSystem webSystem;

    public MobileAppFacade() {
        webSystem = new WebBasedSystem();
    }

    public void requestCarServicing(String carId) {
        System.out.println("Mobile app: Requesting car servicing");
        webSystem.requestCarServicing(carId);
    }

    // Other methods for mobile app functionality
}
