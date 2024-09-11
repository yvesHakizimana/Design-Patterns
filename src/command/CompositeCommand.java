package command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command{

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    @Override
    public void execute() {
        for(var commmand: commandList){
            commmand.execute();
        }
    }
}
