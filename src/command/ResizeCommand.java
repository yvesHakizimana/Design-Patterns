package command;

public class ResizeCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Resizing the  browser window");
    }
}
