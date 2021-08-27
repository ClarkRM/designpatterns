package strategy;
import java.util.ArrayList;

public class GuestList {
    
    private String title;
    private ArrayList<String> people;
    private SearchBehavoir SearchBehavoir;

    GuestList(String title) {

    }

    public boolean add(String person) {

        return true; //added to resolve error, remove later

    }

    public boolean remove(String person) {

        return true; //added to resolve error, remove later
    }

    public String getTitle() {

        return this.title;
    }

    public void setSearchBehavior(SearchBehavoir searchBehavoir) {

    }

    public ArrayList<String> getList() {

        return null; //added to resolve error, remove later
    }

}
