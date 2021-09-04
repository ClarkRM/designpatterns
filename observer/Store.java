package observer;
import java.util.Queue;
import java.util.LinkedList;

/**
 * A class that creates the Store observer and the Best Sellers queue
 * @author Robbie Clark
 */
public class Store implements Observer{
    
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;
    
    /**
     * Initializes the Store observer object
     * @param subject The subject object tht the store observes
     */
    public Store(Subject subject) {
        
        subject.registerObserver(this); 
        this.bestSellers = new LinkedList<Book>();
    }

    /**
     * A method that adds a new book if there are less than 5 books already in the queue.
     * If there are 5 or more books, then the method removes the first book and adds the new one
     */
    public void update(Book book) {

        if(this.bestSellers.size() < 5) {
            this.bestSellers.add(book);
        }
        else {
            this.bestSellers.remove();
            this.bestSellers.add(book);
        }
    }

    /**
     * A method that loops through the Best Sellers queue and displays the contents
     */
    public void display() {
        
        System.out.println("Top 5 Best Sellers:");
        for(Book book : this.bestSellers) {

            System.out.println(book.toString());
        }
        System.out.println();
    }

}
