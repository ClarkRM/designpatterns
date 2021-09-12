package decorator;
import java.util.ArrayList;

/**
 * A method that initiates the Character object
 * @author Robbie Clark
 */
public abstract class Character {
    
    protected ArrayList<String> sections;

    /**
     * The constructer that intiates an arraylist to hold the character
     */
    public Character() {
       
        this.sections = new ArrayList<String>();
    }

    /**
     * A method that loops through the arraylist to print out the character
     */
    public void draw() {
       
        for(int i = 0; i < this.sections.size(); i++) {

            System.out.println(sections.get(i));
        }
    }
}
