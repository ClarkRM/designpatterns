package iterator;

public class Flight {

    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum.equals(flightNum);
        this.from.equals(from);
        this.to.equals(to);
        this.duration = duration;
        this.transfers = transfers;
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getNumTransfers() {
        return this.transfers;
    }

    public String toString() {
        return "";
    }
    
}
