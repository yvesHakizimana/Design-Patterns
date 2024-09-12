package chainOfResponsibility;

public class Compressor extends Handler{
    protected Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compressing the large http request.....");
        return false;
    }
}
