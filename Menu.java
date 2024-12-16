package Menu;

import Commands.ICommand;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<ICommand> commands;

    public Menu() {
        this.commands = new ArrayList<>();
    }

    public void executeCommand(int commandIndex) {
        commands.get(commandIndex).execute();
    }

    public void addCommand(ICommand command) {
        commands.add(command);
    }

    public List<ICommand> getCommands() {
        return commands;
    }
}
