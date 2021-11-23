package state;
import java.util.Random;

public class Hard implements State {
    private ArithemeticGame game;
    private Random random = new Random();

    /**
     * The constructor to the hard mode
     * @param game current game instance
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * Returns a random number 1-100
     */
    public int getNum() {
        return (random.nextInt(100)+1);
    }

    /**
     * Returns a random operation; +, -, *, /
     */
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

    /**
     * Gives a success message, no higher difficulty
     */
    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }

    /**
     * Gives a sad message and sets the game back to medium
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to medium mode.");
        this.game.setState(game.getMediumState());
    }
}
