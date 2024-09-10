package state;

public class SelectionTool implements Tool{

    @Override
    public void mouseUp() {
        System.out.println("Show Selection Icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a red rectangle.");
    }
}
