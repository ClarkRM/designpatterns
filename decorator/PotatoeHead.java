package decorator;

/**
 * A class to create the potato that gets customized
 * @author Robbie Clark
 */
public class PotatoeHead extends Character {
    
    /**
     * A method that sets each section on the arraylist to the string for the potato
     */
    public PotatoeHead() {

        this.sections.add(0, " ");
        this.sections.add(1, "    ____");    
        this.sections.add(2, "  /      \\ ");
        this.sections.add(3, " |        | ");
        this.sections.add(4, " |        | ");
        this.sections.add(5, "  \\      / ");
        this.sections.add(6, "   \\____/ ");
    }
}
