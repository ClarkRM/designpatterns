package observer;
import java.util.Queue;
import java.util.LinkedList;

public class Store implements Observer{
    
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;
    
    public Store(Subject subject) {
        
        subject.registerObserver(this); 
        this.bestSellers = new LinkedList<Book>();
    }

    public void update(Book book) {

        if(this.bestSellers.size() < 5) {
            this.bestSellers.add(book);
        }
        else {
            this.bestSellers.remove();
            this.bestSellers.add(book);
        }
    }

    public void display() {
        
        System.out.println("Top 5 Best Sellers:");
        for(Book book : this.bestSellers) {

            System.out.println(book.toString());
        }
        System.out.println();
    }

}
