package state;
import java.util.Scanner;

public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader = new Scanner(System.in);

    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
    }

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

    public void setState(State state) {
        this.state = state;
    }

    public State getEasyState() {
        return easyState;
    }

    public State getMediumState() {
        return mediumState;
    }

    public State getHardState() {
        return hardState;
    }
}
