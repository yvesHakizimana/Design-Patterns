package command.editor;

public class Main {
    public static void main(String[] args){
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("I am getting better everyday");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
