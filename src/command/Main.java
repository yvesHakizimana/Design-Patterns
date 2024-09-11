package command;

public class Main {
    public static void main(String[] args){
       var compositeCommand = new CompositeCommand();
       compositeCommand.addCommand(new ResizeCommand());
       compositeCommand.addCommand(new BlackAndWhiteCommand());
       compositeCommand.execute();
    }
}
