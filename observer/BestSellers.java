package observer;
import java.util.ArrayList;

/**
 * A class that creates the BestSellers Subject
 * @author Robbie Clark
 */
public class BestSellers implements Subject {
    
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
     * Initializes BestSellers' list of books and observers
     */
    public BestSellers() {

        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }

    /**
     * Registers observers to get updated with the BestSellers list
     */
    public void registerObserver(Observer observer) {

        observers.add(observer);
    }

    /**
     * Removes registered observers
     */
    public void removeObserver(Observer observer) {

        observers.remove(observer);
    }

    /**
     * Notifies all observers in the observer list of any updates to the best sellers list
     */
    public void notifyObservers(Book book) {

        for(Observer observers : observers) {

            observers.update(book);
        }
    }

    /**
     * Adds a book to the best sellers list and calls notifyObservers to update the observers
     * @param book The book being added to the best sellers list
     */
    public void addBook(Book book) {

        bestSellers.add(book);
        notifyObservers(book);
    }


}
