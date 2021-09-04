package observer;
import java.util.ArrayList;

/**
 * A class that creates the Customer observer object and its Wishlist
 * @author Robbie Clark
 */
public class Customer implements Observer{
    
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishlist;

    /**
     * Initializes the customer object
     * @param subject The subject of a customer observer
     * @param firstName The customer's first name
     * @param lastName The customer's last name
     */
    public Customer(Subject subject, String firstName, String lastName) {
        
        subject.registerObserver(this);
        this.firstName = firstName;
        this.lastName = lastName;
        wishlist = new ArrayList<Book>();
    }

    /**
     * A method that adds a new book to the customer's wishlist
     */
    public void update(Book book) {

        wishlist.add(book);
    }

    /**
     * A method that loops through the customer's wishlist and displays the contents
     */
    public void display() {

        System.out.println("Wishlist:");
        for(Book book : this.wishlist) {
            System.out.println(book.toString());
        }
        System.out.println();
    }

}
