package factory;
import java.util.ArrayList;

/**
 * A class that holds and implements the details of a contemporary house
 * @author Robbie Clark
 */
public class ContemporaryPlan extends HousePlan {
    
    /**
     * Constructor that sets the number of rooms, windows, and the square footage, as well as calling the
     * set features and set materials methods
     */
    public ContemporaryPlan() {
        
        super(5, 40, 3000);
        setMaterials();
        setFeatures();
    }

    /**
     * A method that initializes the materials arraylist and adds in the materials needed to build 
     * the contemporary
     */
    protected void setMaterials() {

        materials = new ArrayList<String>();
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("Composites");
    }

    /**
     * A method that initializes the features arraylist and adds in the features a contemporary house has
     */
    protected void setFeatures() {

        features = new ArrayList<String>();
        features.add("Oversized Windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open Floor Plan");
    }

    /**
     * a method that returns the string "Contemporary House" and concatenates it with the the rest of the 
     * contemporary house's info
     */
    public String toString() {

        return "Contemporary House \n" + super.toString();
    }
}
