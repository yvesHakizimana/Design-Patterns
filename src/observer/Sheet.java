package observer;

public class Sheet implements Observer {

    private DataSource dataSource;

    public Sheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Sheet component notified: " + dataSource.getValue());
    }
}
