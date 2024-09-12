package command.editor;

public class BoldCommand implements  UndoableCommand{

    private String prevContent;
    private final HtmlDocument document;
    private final History history;

    public BoldCommand(HtmlDocument document, History history){
        this.document  = document;
        this.history = history;
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }
}
