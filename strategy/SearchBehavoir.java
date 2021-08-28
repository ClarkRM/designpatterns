package strategy;
import java.util.ArrayList;

/**
 * Interface that makes sure the program's search functions use the contains method
 * @author Robbie Clark
 */
public interface SearchBehavoir {
    
    public boolean contains(ArrayList<String> data, String item);
}
