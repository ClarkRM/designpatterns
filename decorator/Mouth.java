package decorator;

/**
 * A class for the character's mouth
 * @author Robbie Clark
 */
public class Mouth extends CharacterDecorator {
    
    /**
     * The constructor that calls super to get the character to decorate and then calls 
     * customize to add the mouth
     * @param character The character to be customized
     */
    public Mouth(Character character) {
       
        super(character);
        customize();
    }

    /**
     * A method that holds the string for the mouth and sets it to the correct section of 
     * the arraylist
     */
    public void customize() {
       
        this.sections.set(5, "  \\ ---- /");
    }
    
}
