package decorator;

/**
 * The Decorator class that allows users to customize the character
 * @author Robbie Clark
 */
public abstract class CharacterDecorator extends Character {
    
    protected Character character;

    /**
     * The constructor loops through the arraylist from the Character object and 
     * copies it into this instance's arraylist
     * @param character The character that the constructor uses to make its own arraylist
     */
    public CharacterDecorator(Character character) {
       
        for (int i = 0; i < character.sections.size(); i++) {
            this.sections.add(i, character.sections.get(i));
        }
    }

    /**
     * Abstract method that is used by the children to customize the character that's passed in
     */
    public abstract void customize();

}
