package observer;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("Spreadsheet component notified");
    }
}
