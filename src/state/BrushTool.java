package state;

public class BrushTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Show Brush Icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a dashed line.");
    }
}
