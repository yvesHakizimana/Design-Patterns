package memento;

public class Editor {

    private String content;

    public EditorState createState(){
        return new EditorState(content);
    }

    public void restoreState(EditorState state){
        content = state.getContent();
    }

    public void setContent(String content) {
       this.content = content;
    }

    public String getContent(){
        return content;
    }

}
