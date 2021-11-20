package state;

public class Medium implements State {
    private ArithemeticGame game;

    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        return -1;
    }

    public String getOperation() {
        return "";
    }

    public void levelUp() {

    }

    public void levelDown() {
        
    }
}
