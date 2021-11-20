package state;

public class Hard implements State {
    private ArithemeticGame game;

    public Hard(ArithemeticGame game) {
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
