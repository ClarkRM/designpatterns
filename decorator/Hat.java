package decorator;

/**
 * A class for the character's hat
 * @author Robbie Clark
 */
public class Hat extends CharacterDecorator {

    /**
     * The constructor that calls super to get the character to decorate and then calls 
     * customize to add the hat
     * @param character The character to be customized
     */
    public Hat(Character character) {
        
        super(character);
        customize();
    }

    /**
     * A method that holds the strings for the hat and sets them to the correct sections of 
     * the arraylist
     */
    public void customize() {
       
        this.sections.set(0, "    ____");
        this.sections.set(1, " __|____|____");
    }
    
}
