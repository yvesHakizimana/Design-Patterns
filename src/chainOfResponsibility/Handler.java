package chainOfResponsibility;

public abstract class Handler {
    private Handler next;

    protected Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest httpRequest){
        if(doHandle(httpRequest))
            return;
        if(next != null)
            next.handle(httpRequest);
    }

    public abstract boolean doHandle(HttpRequest request);
}
