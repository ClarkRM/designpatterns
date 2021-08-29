package strategy;
import java.util.ArrayList;
import java.util.*;

/**
 * Class that runs the binary search function
 * References https://www.geeksforgeeks.org/java-program-to-search-arraylist-element-using-binary-search/
 * @author Robbie Clark
 */
public class BinarySearch implements SearchBehavoir {
    
    /**
     * Contains method searches for a name in the list and returns true if the name is in the list
     */
    public boolean contains(ArrayList<String> data, String item) {

        Collections.sort(data);

        int lowPointer = 0;
        int highPointer = data.size() -1;

        while (lowPointer <= highPointer) {
            
            int middlePointer = lowPointer + (highPointer - lowPointer) / 2;

            if (data.get(middlePointer).equalsIgnoreCase(item)) {
                return true;
            }
            else if (data.get(middlePointer).compareToIgnoreCase(item) < 0) {
                lowPointer = middlePointer + 1;
            }
            else if (data.get(middlePointer).compareToIgnoreCase(item) > 0) {
                highPointer = middlePointer +1;
            }
        }
        return false;
    }
}
