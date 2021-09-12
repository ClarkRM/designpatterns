package decorator;

/**
 * A class for the character's nose
 * @author Robbie Clark
 */
public class Nose extends CharacterDecorator {

    /**
     * The constructor that calls super to get the character to decorate and then calls 
     * customize to add the nose
     * @param character The character to be customized
     */
    public Nose(Character character) {
        
        super(character);
        customize();
    }

    /**
     * A method that holds the string for the nose and sets it to the correct section of 
     * the arraylist
     */
    public void customize() {
        
        this.sections.set(4, " |   >    |");
    }
    
}
