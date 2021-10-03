package singleton;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that handles the Singleton setup of the game
 * @author Robbie Clark
 */
public class TriviaGame {

    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    /**
     * Private constructor that initializes the score, Random class, and Scanner class, as well as 
     * getting the quesitons list from the DataLoader and starting the game
     */
    private TriviaGame() {
       
        this.questions = DataLoader.getTriviaQuestions();
        this.score = 0;
        rand = new Random();
        reader = new Scanner(System.in);
        playRound();
    }

    /**
     * The static method that initializes the entire game
     * @return The game instance
     */
    public static TriviaGame getInstance() {
        
        return new TriviaGame();
    }

    /**
     * The method that handles replaying and prints out the user's score if they quit
     */
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

    /**
     * The method that prints a random question and accepts the User's guess, increasing the score by
     * 1 if the user got the question correct, printing an error message if the user puts in an
     * invalid guess, and printing the correct answer if the user's input was invalid or wrong
     * @return true if the guess was correct, false if the guess was invalid or incorrect
     */
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
