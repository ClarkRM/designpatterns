package iterator;
import java.util.Iterator;

public class FlightIterator {

    private Flight[] flights;
    private int position = 0;

    public FlightIterator(Flight[] flights) {
            this.flights = flights;
    } 

    public boolean hasNext() {
        if(position >= flights.length || flights[position] == null)
            return false;
        return true;
    }

    public Flight next() {
        return flights[position++];
    }
    
}
