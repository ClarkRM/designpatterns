package decorator;

/**
 * The class for the character's eyes
 * @author Robbie Clark
 */
public class Eyes extends CharacterDecorator {
    
    /**
     * The constructor that calls super to get the character to decorate and then calls 
     * customize to add the eyes
     * @param character The character to be customized
     */
    public Eyes(Character character) {
        
        super(character);
        customize();
    }

    /**
     * A method that holds the string for the eyes and sets it to the correct section of 
     * the arraylist
     */
    public void customize() {
        
        this.sections.set(3, " |  o  o  |");
    }

}
