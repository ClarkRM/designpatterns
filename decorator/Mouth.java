package decorator;

public class Mouth extends CharacterDecorator {
    
    public Mouth(Character character) {
        super(character);
        customize();
    }

    public void customize() {
        this.sections.set(5, "  \\ ---- /");
    }
    
}
