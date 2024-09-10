package memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<EditorState> editorStates = new ArrayList<>();

    public void push(EditorState state){
        editorStates.add(state);
    }

    public EditorState pop(){
        int lastIndex = editorStates.size() - 1;
        return editorStates.remove(lastIndex);
    }
}
