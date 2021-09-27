package iterator;
/**
 * A class for the Airline, which holds an array of all the flights
 * @author Robbie Clark
 */
public class Airline {
    
    private String title;
    private Flight[] flights;
    private int size;

    /**
     * Constructor for the class, sets the title of the airline and
     * creates a new flight array
     * @param title the name of the airline
     */
    public Airline(String title) {
       
        this.title = title;
        this.flights = new Flight[1];
        this.size = this.flights.length;
    }

    /**
     * A method that adds flights to the array, also checks to see if the array is
     * full and grows the array by 1 if that is the case
     * @param flightNum the flight number
     * @param from where the flight comes from
     * @param to where the flight goes to
     * @param duration how long the flight is in minutes
     * @param transfers how many transfers the flight has
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        
        Flight flight = new Flight(flightNum, from, to, duration, transfers);
        if(this.flights[this.size-1] != null) {
            growArray(this.flights);
            this.size++;
            this.flights[this.size-1] = flight;
        }
        for(int i = 0; i < size; i++) {
            if(this.flights[i] == null) {
                this.flights[i] = flight;
            }
        }
    }

    /**
     * a getter for the title of the airline
     * @return the airline's name
     */
    public String getTitle() {
       
        return this.title;
    }

    /**
     * A method that increases the size of the array by 1, 
     * with the use of a temporary array
     * @param flights the current/smaller array of flights
     * @return the larger flights array
     */
    private Flight[] growArray(Flight[] flights) {
        
        Flight[] largerFlights = new Flight[this.size+1];
        for(int i = 0; i < this.flights.length; i++) {
            largerFlights[i] = this.flights[i];
        }
        this.flights = largerFlights;
        return this.flights;
    }

    /**
     * A method that creates a new iterator for the program
     * @return the iterator
     */
    public FlightIterator createIterator() {

        return new FlightIterator(this.flights);
    }
    
}
