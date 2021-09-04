package observer;
import java.util.ArrayList;

public class BestSellers implements Subject {
    
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    public BestSellers() {

        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }

    public void registerObserver(Observer observer) {

        observers.add(observer);
    }

    public void removeObserver(Observer observer) {

        observers.remove(observer);
    }

    public void notifyObservers(Book book) {

        for(Observer observers : observers) {

            observers.update(book);
        }
    }

    public void addBook(Book book) {

        bestSellers.add(book);
        notifyObservers(book);
    }


}
