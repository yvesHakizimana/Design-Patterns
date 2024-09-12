package chainOfResponsibility;

public class Main {
    public static void main(String[] args){
        var logger = new Logger(null);
        var compressor = new Compressor(logger);
        var authenticator = new Authenticator(compressor);

        var webServer =  new WebServer(authenticator);

        webServer.handle(new HttpRequest("admin", "password"));
    }
}
