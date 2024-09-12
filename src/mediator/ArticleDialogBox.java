package mediator;

public class ArticleDialogBox extends DialogBox{

    private TextBox textBox = new TextBox(this);
    private Button saverButton = new Button(this);
    private ListBox listBox = new ListBox(this);

    public void simulateUserInteraction(){
        listBox.setSelection("Mediator pattern selected");
        textBox.setTitle("");
        System.out.println("Text Box Content: " + textBox.getTitle());
        System.out.println("Save Button Content: " + saverButton.isEnabled());
    }

    @Override
    void changed(UIControl control) {
        if(control == listBox)
            setSelection();
        if(control == textBox)
            titleSelected();

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
