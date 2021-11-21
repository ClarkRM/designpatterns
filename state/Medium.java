package state;
import java.util.Random;

public class Medium implements State {
    private ArithemeticGame game;
    private Random random = new Random();

    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        return (random.nextInt(50)+1);
    }

    public String getOperation() {
        int operationGenerator = random.nextInt(3);
        if(operationGenerator == 0) {
            return "+";
        } else if(operationGenerator==1) {
            return "-";
        } else {
            return "*";
        }
    }

    public void levelUp() {
        System.out.println("You've been advanced to the hardest mode.");
        this.game.setState(game.getHardState());
    }

    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode.");
        this.game.setState(game.getEasyState());
    }
}
