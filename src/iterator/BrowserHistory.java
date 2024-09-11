package iterator;


public class BrowserHistory {

    private String[] urls = new String[4];
    private int index = 0;


    public void setUrls(String url) {
       urls[index++] = url;
    }


    public String[] getUrls() {
        return urls;
    }


    public Iterator createIterator(){
        return new ArrayIterator(this);
    }

    private class ArrayIterator implements Iterator{

        private BrowserHistory history;
        private int index;

        public ArrayIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.getUrls().length);
        }

        @Override
        public String current() {
            return history.getUrls()[index];
        }

        @Override
        public void next() {
            index++;
        }
    }


//    private class ListIterator implements Iterator {
//
//        private BrowserHistory history;
//        private int index;
//
//        public ListIterator(BrowserHistory history){
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index < history.getUrls().size());
//        }
//
//        @Override
//        public String current() {
//            return history.getUrls().get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }
}