package Observer;

public interface Sujeto {
    void addObserver(Observador observer);

    void removeObserver(Observador observer);

    void notifyObservers();
}
