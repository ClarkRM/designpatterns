package singleton;

public class Question {
    
    private String question;
    private String[] answers;
    private int correctAnswer;

    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.answers = new String[4];
        this.question = question;
        this.answers[0] = ans1;
        this.answers[1] = ans2;
        this.answers[2] = ans3;
        this.answers[3] = ans4;
        this.correctAnswer = correctAnswer;
    }

    public String toString() {

        return this.question + "\n1: "+ this.answers[0]
            + "\n2: "+ this.answers[1] + "\n3: "+ this.answers[2]
            + "\n4: "+ this.answers[3] + "\n\nEnter answer: ";
    }

    public boolean isCorrect(int userAnswer) {

        return userAnswer == this.correctAnswer+1;
    }

    public String getCorrectAnswer() {

        return "The correct answer was: "+this.answers[correctAnswer];
    }
}
