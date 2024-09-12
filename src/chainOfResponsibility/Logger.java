package chainOfResponsibility;

public class Logger extends Handler{
    protected Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Logging the details of the request.....");
        return false;
    }
}
