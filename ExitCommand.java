package Commands;

public class ExitCommand implements ICommand {

    @Override
    public void execute() {
        System.out.println("Вихід з програми...");
        System.exit(0);
    }
}
