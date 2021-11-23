package state;
import java.util.Random;

public class Medium implements State {
    private ArithemeticGame game;
    private Random random = new Random();

    /**
     * Constructor for the medium mode
     * @param game current game instance
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * Returns a random number 1-50
     */
    public int getNum() {
        return (random.nextInt(50)+1);
    }

    /**
     * Returns a random operation, +, -, or /
     */
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

    /**
     * Gives success message and sets the game one level of difficulty higher
     */
    public void levelUp() {
        System.out.println("You've been advanced to the hardest mode.");
        this.game.setState(game.getHardState());
    }

    /**
     * Gives a sad message and set the game one level of difficulty lower
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode.");
        this.game.setState(game.getEasyState());
    }
}
