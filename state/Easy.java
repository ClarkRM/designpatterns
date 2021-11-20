package state;
import java.util.Random;

public class Easy implements State {
    private ArithemeticGame game;
    private Random random = new Random();

    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        return (random.nextInt(9)+1);
    }

    public String getOperation() {
        int operationGenerator = random.nextInt(2);
        if(operationGenerator == 0) {
            return "+";
        } else if(operationGenerator == 1) {
            return "-";
        }
        return "";
    }

    public void levelUp() {
        System.out.println("You've been advanced to medium mode.");
        this.game.setState(game.getMediumState());
    }

    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }
}
