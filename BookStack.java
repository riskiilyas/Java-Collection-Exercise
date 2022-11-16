import java.util.Stack;

public class BookStack extends Stack<String> {
    public void addBook(String book) {
        this.push(book);
    }

    public void removeBook() {
        this.pop();
    }

    public void printBooks() {
        for (String book : this) {
            System.out.println(book);
        }
    }
    
}
