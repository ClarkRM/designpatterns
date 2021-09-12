package decorator;
import java.util.ArrayList;

public abstract class Character {
    
    protected ArrayList<String> sections;

    public Character() {
        this.sections = new ArrayList<String>();
    }

    public void draw() {
        for(int i = 0; i < this.sections.size(); i++) {

            System.out.println(sections.get(i));
        }
    }
}
