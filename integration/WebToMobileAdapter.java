package integration;

// WebToMobileAdapter.java (Adapter)
public class WebToMobileAdapter {
    private WebBasedSystem webSystem;

    public WebToMobileAdapter() {
        webSystem = new WebBasedSystem();
    }

    public void requestCarWashing(String carId) {
        System.out.println("Adapter: Converting web-based car washing request to mobile format");
        webSystem.requestCarServicing(carId);
    }

    // Other adapted methods
}
