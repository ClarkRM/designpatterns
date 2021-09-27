package iterator;

/**
 * A class that creates the flight object
 * @author Robbie Clark
 */
public class Flight {

    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    /**
     * The constructor for the class
     * @param flightNum the flight's ID number
     * @param from where the flight comes from
     * @param to where the flight goes to
     * @param duration how long the flight is in minutes
     * @param transfers how many transfers the flight has
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers) {
       
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    /**
     * Getter method for where the flight comes from
     * @return where the flight comes from
     */
    public String getFrom() {
       
        return this.from;
    }

    /**
     * Getter method for where the flight goes to
     * @return where the flight goes to
     */
    public String getTo() {
        
        return this.to;
    }

    /**
     * Getter method for how long the flight is in minutes
     * @return how long the flight is in minutes
     */
    public int getDuration() {
       
        return this.duration;
    }

    /**
     * Getter method for how many transfers the flight has
     * @return how many transfers the flight has
     */
    public int getNumTransfers() {
        
        return this.transfers;
    }

    /**
     * A method to convert all the information into a String, also
     * converts the duration into hours and minutes
     */
    public String toString() {
        return "Flight Number: " + this.flightNum + "\nFrom: " + getFrom() 
            + "\nTo: " + getTo() + "\nDuration: " + getDuration()/60 + " hours and " + getDuration()%60 + " minutes\n" 
            + getNumTransfers() + " Transfer(s)";
    }
    
}
