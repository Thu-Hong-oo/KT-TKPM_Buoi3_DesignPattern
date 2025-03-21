package iuh.pattern.observer.book;
public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyAllObserver();
}
