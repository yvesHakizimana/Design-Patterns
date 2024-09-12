package observer;

public class SpreadSheet implements Observer {
    @Override
    public void update(Object value) {
        System.out.println("Spreadsheet component notified: " + value);
    }
}
