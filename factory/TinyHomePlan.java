package factory;
import java.util.ArrayList;
 
/**
 * A class that holds and implements the details of a tiny house
 * @author Robbie Clark
 */
public class TinyHomePlan extends HousePlan {
   
    /**
     * Constructor that adds the number of rooms, windows, and the square footage, as well as calling the
     * set features and set materials methods
     */
    public TinyHomePlan() {
        
        super(1, 5, 200);
        setMaterials();
        setFeatures();
    }

     /**
     * A method that initializes the materials arraylist and adds in the materials needed to build 
     * the tiny house
     */
    protected void setMaterials() {
        
        materials = new ArrayList<String>();
        materials.add("Lumber");
        materials.add("Insulation");
        materials.add("Metal Roofing");
        materials.add("Hardware");
    }

    /**
     * A method that initializes the features arraylist and adds in the features a tiny house has
     */
    protected void setFeatures() {

        features = new ArrayList<String>();
        features.add("Natural Light");
        features.add("Creative storage");
        features.add("Multipurpose areas");
        features.add("Multi-use applications");
    }

    /**
     * a method that returns the string "Tiny Home" and concatenates it with the the rest of the 
     * tiny house's info
     */
    public String toString() {

        return "Tiny Home \n" + super.toString();
    }
}
