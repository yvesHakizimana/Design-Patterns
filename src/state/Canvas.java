package state;

public class Canvas {
    private Tool currentTool;

    public void mouseDown(){
        currentTool.mouseDown();
    }

    public void mouseUp(){
        currentTool.mouseUp();
    }

    public Tool getCurrentTool(){
        return currentTool;
    }

    public void setCurrentTool(Tool tool){
        this.currentTool = tool;
    }
}
