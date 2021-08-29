package strategy;
import java.util.ArrayList;

/**
 * Backend of the guestlist
 * @author Robbie Clark
 */
public class GuestList {
    
    private String title;
    private ArrayList<String> people = new ArrayList<>();
    private SearchBehavoir searchBehavoir = new LinearSearch();

    /**
     * Creates a new guestlist with a specified title
     * @param title the title the user provides
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
        if(!searchBehavoir.contains(people, person)) {
            people.add(person);
            return true;
        }
        return false;

    }

    /**
     * Removes a person from the guestlist
     * @param person The name of the person being removed
     * @return Returns true if the person is in the list, false if the person is not in the list
     */
    public boolean remove(String person) {
        if(searchBehavoir.contains(people, person)) {
            people.remove(person);
            return true;
        }
        return false;
    }

    /**
     * A method to return the title of the list
     * @return The user-entered title
     */
    public String getTitle() {
        return this.title;
    }
    
    /**
     * Allows user to enter which search behavior to use
     * @param searchBehavoir either binary search or linear search
     */
    public void setSearchBehavior(SearchBehavoir searchBehavoir) {
        this.searchBehavoir = searchBehavoir;
    }

    /**
     * A method to return the names stored in the ArrayList
     * @return the data in the array list
     */
    public ArrayList<String> getList() {
        return this.people;
    }

}
