package singleton;

/**
 * A class to create the trivia question object
 * @author Robbie Clark
 */
public class Question {
    
    private String question;
    private String[] answers;
    private int correctAnswer;

    /**
     * Constructor, initializes the question, array of answers, and the number value corresponding 
     * to the correct answer
     * @param question The trivia question being asked
     * @param ans1 The first answer option
     * @param ans2 The second answer option
     * @param ans3 The third answer option
     * @param ans4 The fourth answer option
     * @param correctAnswer the number corresponding to the correct answer
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        
        this.answers = new String[4];
        this.question = question;
        this.answers[0] = ans1;
        this.answers[1] = ans2;
        this.answers[2] = ans3;
        this.answers[3] = ans4;
        this.correctAnswer = correctAnswer;
    }

    /**
     * A method to display the question and answer options as a String
     */
    public String toString() {

        return this.question + "\n1: "+ this.answers[0]
            + "\n2: "+ this.answers[1] + "\n3: "+ this.answers[2]
            + "\n4: "+ this.answers[3] + "\n\nEnter answer: ";
    }

    /**
     * A method that checks to see if the user entered the correct answer
     * @param userAnswer the integer value of the correct answer, 1 larger than the correctAnswer variable
     * @return true if the user entered the right value, false if the user entered the wrong value
     */
    public boolean isCorrect(int userAnswer) {

        return userAnswer == this.correctAnswer+1;
    }

    /**
     * A method to display which answer was correct
     * @return A string stating which which answer was correct
     */
    public String getCorrectAnswer() {

        return "The correct answer was: "+this.answers[correctAnswer];
    }
}
