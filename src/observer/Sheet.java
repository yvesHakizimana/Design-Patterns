package observer;

public class Sheet implements Observer {
    @Override
    public void update() {
        System.out.println("Sheet component notified");
    }
}
