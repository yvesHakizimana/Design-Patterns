package observer;

public class Main {
    public static void main(String[] args){
        var dataSource = new DataSource();
        var spreadSheet = new SpreadSheet(dataSource);
        var sheet = new Sheet(dataSource);

        dataSource.addObserver(spreadSheet);
        dataSource.addObserver(sheet);

        dataSource.setValue(10);

        dataSource.notifyObservers(dataSource.getValue());
    }
}
