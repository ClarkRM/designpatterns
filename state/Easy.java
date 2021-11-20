package state;

public class Easy implements State {
    private ArithemeticGame game;

    public Easy(ArithemeticGame game) {
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
