package singleton;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class TriviaGame {

    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    private TriviaGame() {
        this.questions = DataLoader.getTriviaQuestions();
        this.score = 0;
        rand = new Random();
        reader = new Scanner(System.in);
        playRound();
    }

    public static TriviaGame getInstance() {
        return new TriviaGame();
    }

    public void play() {
        boolean playResponse = true;
        while(playResponse) {
            
            System.out.print("(P)lay or (Q)uit: ");
            String response = reader.next();
            
            if(response.equalsIgnoreCase("q"))
                playResponse = false;
            else if(response.equalsIgnoreCase("p")) {
                playRound();
            }
            else 
                System.out.println("ERROR: Invalid Input");
        }
        System.out.println("\nYou won "+ this.score + " games!\nGoodbye");
    }

    private boolean playRound() {
        
        int questionNum = rand.nextInt(10);
        System.out.print("\n"+this.questions.get(questionNum).toString());

        int userAns = reader.nextInt();
        reader.nextLine();

        if(this.questions.get(questionNum).isCorrect(userAns)) {

            System.out.println("Yay! You got it correct");
            score++;
            return true;
        }
        else if(userAns <= 0 || userAns > 4)
            System.out.println("ERROR: Invalid Answer!");
        
        System.out.println("You got it wrong!");
        System.out.println(this.questions.get(questionNum).getCorrectAnswer());
        return false;
    }
    
}
