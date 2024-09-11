package iterator;

public class Main {
    public static void main(String[] args){
        var history = new BrowserHistory();
        history.setUrls("a");
        history.setUrls("b");
        history.setUrls("c");
        history.setUrls("d");


        var iterator = history.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
