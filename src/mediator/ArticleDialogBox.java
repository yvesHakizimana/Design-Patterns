package mediator;

public class ArticleDialogBox{

    private TextBox textBox = new TextBox();
    private Button saverButton = new Button();
    private ListBox listBox = new ListBox();


    public ArticleDialogBox(){
        listBox.addEventHandler(this::setSelection);
        textBox.addEventHandler(this::titleSelected);
    }

    public void simulateUserInteraction(){
        listBox.setSelection("Mediator pattern selected");
        textBox.setTitle("");
        listBox.setSelection("using the observer pattern in notifying the dialog box.");
        System.out.println("Text Box Content: " + textBox.getTitle());
        System.out.println("Save Button Content: " + saverButton.isEnabled());
    }

    private void setSelection(){
       textBox.setTitle(listBox.getSelection());
       saverButton.setEnabled(true);
    }

    private void titleSelected(){
        var content = textBox.getTitle();
        var isEmpty = (content == null || content.isEmpty());
        saverButton.setEnabled(!isEmpty);
    }
}
