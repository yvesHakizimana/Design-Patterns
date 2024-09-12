package command.editor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> undoableCommands = new ArrayDeque<>();

    public void push(UndoableCommand command){
        undoableCommands.push(command);
    }
    public UndoableCommand pop(){
        return undoableCommands.pop();
    }
}
