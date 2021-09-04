package observer;

/**
 * A class that creates the book object
 * @author Robbie Clark
 */
public class Book {
    
    private String title;
    private String authorFirstName;
    private String authorLastName;

    /**
     * Initializes new books
     * @param title The title of the book
     * @param authorFirstName The first name of the book's author
     * @param authorLastName The last name of the book's author
     */
    public Book(String title, String authorFirstName, String authorLastName) {

        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    /**
     * A method to get the title of a book
     * @return the title of the book
     */
    public String getTitle() {

        return this.title;
    }

    /**
     * A method to get the author's first name
     * @return the first name of the author
     */
    public String getAuthorFirstName() {

        return this.authorFirstName;
    }

    /**
     * A method to get the author's last name
     * @return the last name of the author
     */
    public String getAuthorLastName() {

        return this.authorLastName;
    }

    /**
     * A method that returns a concatenated string of the title and author's full name
     */
    public String toString() {

        return getTitle() + " by: " + getAuthorFirstName() + " " + getAuthorLastName();
    }

}
