package state;
import java.util.Scanner;

public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader = new Scanner(System.in);
    /**
    * Constructor for the game, initializes each state and sets the overall state variable to easy
    */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
    }

    /**
     * Method that gets two random numbers and a random operation, uses those to create a math question
     * Tracks score, when score == 3, the game levels up, score == -3, game levels down
     */
    public void pressQuestionButton() {
        int firstNum = state.getNum();
        int secondNum = state.getNum();
        String operation = state.getOperation();
        int response;
        System.out.println("\n"+firstNum +" "+ operation +" "+ secondNum + " = ");
        
        response = reader.nextInt();
        reader.nextLine();

        if(operation.equals("+")) {

            if(response == (firstNum+secondNum)) {
                System.out.println("Correct");
                score++;
            }
            else {
                System.out.println("Incorrect");
                score--;
            }

        } else if(operation.equals("-")) {

            if(response == (firstNum-secondNum)) {
                System.out.println("Correct");
                score++;
            }
            else {
                System.out.println("Incorrect");
                score--;
            }
           
        } else if(operation.equals("*")) {

            if(response == (firstNum*secondNum)) {
                System.out.println("Correct");
                score++;
            }
            else {
                System.out.println("Incorrect");
                score--;
            }

        } else if(operation.equals("/")) {

            if(response == (firstNum/secondNum)) {
                System.out.println("\nCorrect");
                score++;
            }
            else {
                System.out.println("\nIncorrect");
                score--;
            }
        }

        if(score >= 3) {
            state.levelUp();
            score = 0;
        } else if(score <= -3) {
            state.levelDown();
            score = 0;
        }
        System.out.println();
    }

    /**
     * Method that sets the game state
     * @param state the difficulty of the game
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * A method to return the easy mode state
     * @return the easy mode
     */
    public State getEasyState() {
        return easyState;
    }

    /**
     * A method to return the medium mode state
     * @return the medium mode
     */
    public State getMediumState() {
        return mediumState;
    }

    /**
     * A method to return the hard mode state
     * @return the hard mode
     */
    public State getHardState() {
        return hardState;
    }
}
