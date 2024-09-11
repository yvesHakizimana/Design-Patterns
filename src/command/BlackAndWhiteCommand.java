package command;

public class BlackAndWhiteCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Applying Black And White command.");
    }
}
