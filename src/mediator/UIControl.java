package mediator;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    private List<Observer> observers = new ArrayList<>();

    public void addEventHandler(Observer observer){
        this.observers.add(observer);
    }

    protected void notifyEventHandlers(){
        for( var observer: observers)
            observer.handleEvent();
    }
}
