package factory;
import java.util.ArrayList;

/**
 * A class that holds and implements the details of a log cabin
 * @author Robbie Clark
 */
public class LogCabinPlan extends HousePlan {
    
    /**
     * Constructor that sets the number of rooms, windows, and the square footage, as well as calling the
     * set features and set materials methods
     */
    public LogCabinPlan() {
        
        super(2, 10, 1800);
        setMaterials();
        setFeatures();
    }

    /**
     * A method that initializes the materials arraylist and adds in the materials needed to build the log cabin
     */
    protected void setMaterials() {
        
        materials = new ArrayList<String>();
        materials.add("Log Siding");
        materials.add("Board and Batten Siding");
        materials.add("White Pine");
    }

    /**
     * A method that initializes the features arraylist and adds in the features a log cabin has
     */
    protected void setFeatures() {

        features = new ArrayList<String>();
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");
    }

    /**
     * a method that returns the string "Log Cabin" and concatenates it with the the rest of the 
     * log cabin's info
     */
    public String toString() {

        return "Log Cabin \n" + super.toString();
    }
}
