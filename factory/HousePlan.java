package factory;
import java.util.ArrayList;

/**
 * An abstract class that creates the HousePlan object
 * @author Robbie Clark
 */
public abstract class HousePlan {
    
    protected ArrayList<String> materials;
    protected ArrayList<String> features;

    private int numRooms;
    private int numWindows;
    private int squareFeet;

    /**
     * Constructor that sets the number of room, windows, and the square footage to values passed in 
     * by a house plan
     * @param numRooms The number of rooms the house plan specifies
     * @param numWindows The number of windows the house plan specifies
     * @param squareFeet The square footage the house plan specifies
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;

    }

    /**
     * Abstract method implemented by the child objects
     */
    protected abstract void setMaterials();

    /**
     * Abstract method implemented by the child objects
     */
    protected abstract void setFeatures();

    /**
     * An accessor method for the materials list
     * @return The instance's list of materials
     */
    public ArrayList<String> getMaterials() {
        
        return this.materials;
    }

    /**
     * An accessor method for the features list
     * @return The instance's list of features
     */
    public ArrayList<String> getFeatures() {
        
        return this.features;
    }

    /**
     * An accessor method for the number of rooms
     * @return An integer number of rooms
     */
    public int getNumRooms() {
        
        return this.numRooms;
    }

    /**
     * An accessor method for the number of windows
     * @return An integer number of windows
     */
    public int getNumWindows() {

        return this.numWindows;
    }

    /**
     * An accessor method for the square footage
     * @return The integer square feet of the house plan
     */
    public int getSquareFeet() {

        return this.squareFeet;
    }

    /**
     * A method to concatenate all the info for a house plan and return it as a string
     */
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
