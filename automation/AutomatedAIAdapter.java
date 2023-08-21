package automation;

// AutomatedAIAdapter.java (Adapter)
public class AutomatedAIAdapter implements AutomatedAI {
    private AsiaAutomatedAI asiaAI;
    private USAAutomatedAI usaAI;

    public AutomatedAIAdapter(AsiaAutomatedAI asiaAI, USAAutomatedAI usaAI) {
        this.asiaAI = asiaAI;
        this.usaAI = usaAI;
    }

    public void driveAutomatically() {
        // Assuming a parameter to determine the geographical area
        String area = "Asia"; // or "USA"
        
        if (area.equals("Asia")) {
            asiaAI.driveAutomatically();
        } else if (area.equals("USA")) {
            usaAI.driveAutomatically();
        } else {
            System.out.println("Invalid geographical area");
        }
    }
}