package strategy;
import java.util.ArrayList;

/**
 * Class that runs the linear search function
 * @author Robbie Clark
 */
public class LinearSearch implements SearchBehavoir{

    
    public boolean contains(ArrayList<String> data, String item) {
        for(int i=0; i<data.size(); i++) {

            if(data.get(i).equalsIgnoreCase(item)) {
                return true;
            }
        }
        return false;
    }
    
}
