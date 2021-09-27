package iterator;

public class Airline {
    
    private String title;
    private Flight[] flights;
    private int size;

    public Airline(String title) {
        this.title.equals(title);
        flights = new Flight[1];
        size = flights.length;
    }

    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        Flight flight = new Flight(flightNum, from, to, duration, transfers);
        if(flights[size] != null) {
            flights = growArray(flights).clone();
            flights[size] = flight;
        }
        for(int i = 0; i < size; i++) {
            if(flights[i] == null) {
                flights[i] = flight;
            }
        }
    }

    public String getTitle() {
        return this.title;
    }

    private Flight[] growArray(Flight[] flights) {
        size++;
        Flight[] largerFlights = new Flight[size];
        largerFlights = flights.clone();
        return largerFlights;
    }

    public FlightIterator createIterator() {
        return new FlightIterator(flights);
    }
    
}
