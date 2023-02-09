package headfirst.designpatterns.combining.fobserver;

public interface QuackObservable {
    public void registerObject(Observer observer);
    public void notifyObservers();
}
