package commands;
import java.util.ArrayList;
import java.util.List;


// CentralOnlineSystem.java (Invoker)
public class CentralOnlineSystem {
    private List<Command> pendingCommands = new ArrayList<>();

    public void addCommand(Command command) {
        pendingCommands.add(command);
    }

    public void processCommands() {
        for (Command command : pendingCommands) {
            command.execute();
        }
        pendingCommands.clear();
    }
}
