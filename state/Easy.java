package state;
import java.util.Random;

public class Easy implements State {
    private ArithemeticGame game;
    private Random random = new Random();

    /**
     * Constructor for easy mode
     * @param game The current game instance
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * A method to get a random number 1-10
     */
    public int getNum() {
        return (random.nextInt(10)+1);
    }

    /**
     * A method to return a random operation, + or -
     */
    public String getOperation() {
        int operationGenerator = random.nextInt(2);
        if(operationGenerator == 0) {
            return "+";
        } else if(operationGenerator == 1) {
            return "-";
        }
        return "";
    }

    /**
     * A method to set the game's state one level of difficulty higher
     */
    public void levelUp() {
        System.out.println("You've been advanced to medium mode.");
        this.game.setState(game.getMediumState());
    }

    /**
     * A method that returns a sad message, doesn't level down when state is easy
     */
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }
}
