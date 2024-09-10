package state;

public class EraserTool implements Tool {

    @Override
    public void mouseUp() {
        System.out.println("Showing Eraser Icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erasing the surface");
    }
}
