package iuh.pattern.observer.gpcoder;

public interface Subject {

    // methods to register and unregister observers
    public void register(Observer observer);
    
    public void unregister(Observer observer);

    public void notifyAllObservers();

    public Object getUpdate(Observer observer);
    
}
