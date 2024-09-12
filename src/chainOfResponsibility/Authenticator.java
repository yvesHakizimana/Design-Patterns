package chainOfResponsibility;

public class Authenticator extends Handler{
    protected Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authentication is in the process and being done......");
        return !(request.getUsername().equals("admin") && request.getPassword().equals("password"));
    }
}
