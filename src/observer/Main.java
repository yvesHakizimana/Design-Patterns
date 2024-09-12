package observer;

public class Main {
    public static void main(String[] args){
        var dataSource = new DataSource();
        var spreadSheet = new SpreadSheet();
        var sheet = new Sheet();

        dataSource.addObserver(spreadSheet);
        dataSource.addObserver(sheet);

        dataSource.notifyObservers();
    }
}
