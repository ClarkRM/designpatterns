package strategy;
import java.util.ArrayList;

/**
 * Backend of the guestlist
 * @author Robbie Clark
 */
public class GuestList {
    
    private String title;
    private ArrayList<String> people;
    private SearchBehavoir SearchBehavoir;

    /**
     * 
     * @param title
     */
    GuestList(String title) {
        this.title = title;
    }

    /**
     * Adds a person to the guestlist
     * @param person The name of the person being added
     * @return Returns true if the person is in the list, false if the person is not in the list 
     */
    public boolean add(String person) {

        return true; //added to resolve error, remove later

    }

    /**
     * Removes a person from the guestlist
     * @param person The name of the person being removed
     * @return Returns true if the person is in the list, false if the person is not in the list
     */
    public boolean remove(String person) {

        return true; //added to resolve error, remove later
    }

    /**
     * 
     * @return
     */
    public String getTitle() {

        return this.title;
    }
    
    /**
     * Allows user to enter which search behavior to use, etiher binary search or linear search
     * @param searchBehavoir
     */
    public void setSearchBehavior(SearchBehavoir searchBehavoir) {

    }

    /**
     * 
     * @return
     */
    public ArrayList<String> getList() {

        return null; //added to resolve error, remove later
    }

}
