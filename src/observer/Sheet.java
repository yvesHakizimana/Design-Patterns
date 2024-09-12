package observer;

public class Sheet implements Observer {
    @Override
    public void update(Object value) {
        System.out.println("Sheet component notified: " + value );
    }
}
