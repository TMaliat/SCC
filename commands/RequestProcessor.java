package commands;

// RequestProcessor.java (Template)
public abstract class RequestProcessor {
    public void processRequest() {
        approveRequest();
        performRequest();
        finalizeRequest();
    }

    protected abstract void approveRequest();
    protected abstract void performRequest();
    protected abstract void finalizeRequest();
}
