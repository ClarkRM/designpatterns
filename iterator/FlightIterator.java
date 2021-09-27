package iterator;
import java.util.Iterator;

/**
 * A class that holds all the iterator info
 * @author Robbie Clark
 */
public class FlightIterator {

    private Flight[] flights;
    private int position = 0;

    /**
     * The constructor for the class
     * @param flights the array of Flight objects
     */
    public FlightIterator(Flight[] flights) {
           
        this.flights = flights;
    } 

    /**
     * A method to check if the array has one more free space
     * @return true or false depending on if the array has one more free space
     */
    public boolean hasNext() {

        if(position >= flights.length || flights[position] == null)
            return false;
        return true;
    }

    /**
     * A method to go to the next Flight in the array
     * @return the next Flight in the array
     */
    public Flight next() {

        return flights[position++];
    }
    
}
