package state;
import java.util.Random;

public class Hard implements State {
    private ArithemeticGame game;
    private Random random = new Random();

    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        return (random.nextInt(100)+1);
    }

    public String getOperation() {
        int operationGenerator = random.nextInt(4);
        if(operationGenerator == 0) {
            return "+";
        } else if(operationGenerator==1) {
            return "-";
        } else if(operationGenerator == 2) {
            return "*";
        } else {
            return "/";
        }
    }

    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }

    public void levelDown() {
        System.out.println("You are struggling, let's go to medium mode.");
        this.game.setState(game.getMediumState());
    }
}
