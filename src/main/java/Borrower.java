import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> booksBorrowed;

    public Borrower(){
        this.booksBorrowed = new ArrayList<>();
    }

    public int getBorrowedCount(){
        return this.booksBorrowed.size();
    }
}
