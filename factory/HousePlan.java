package factory;
import java.util.ArrayList;

public abstract class HousePlan {
    
    protected ArrayList<String> materials;
    protected ArrayList<String> features;

    private int numRooms;
    private int numWindows;
    private int squareFeet;

    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;

    }

    protected void setMaterials() {
        
    }

    protected void setFeatures() {
        
    }

    public ArrayList<String> getMaterials() {
        
        return this.materials;
    }

    public ArrayList<String> getFeatures() {
        
        return this.features;
    }

    public int getNumRooms() {
        
        return this.numRooms;
    }

    public int getNumWindows() {

        return this.numWindows;
    }

    public int getSquareFeet() {

        return this.squareFeet;
    }

    public String toString() {
        
        String allInfo = "";

        allInfo += "Square feet: " + getSquareFeet() + "\n";
        allInfo += "Rooms: " + getNumRooms() + "\n";
        allInfo += "Windows: " + getNumWindows() + "\n";

        allInfo += "\nMaterials: \n";

        for(String materials : materials) {
            allInfo += "-"+ materials + "\n";
        }

        allInfo += "\nFeatures: \n";

        for(String features : features) {
            allInfo += "-" + features + "\n";
        }

        return allInfo;
    }

}
