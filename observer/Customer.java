package observer;
import java.util.ArrayList;

public class Customer implements Observer{
    
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishlist;

    public Customer(Subject subject, String firstName, String lastName) {
        
        subject.registerObserver(this);
        this.firstName = firstName;
        this.lastName = lastName;
        wishlist = new ArrayList<Book>();
    }

    public void update(Book book) {

        wishlist.add(book);
    }

    public void display() {

        System.out.println("Wishlist:");
        for(Book book : this.wishlist) {
            System.out.println(book.toString());
        }
    }

}
