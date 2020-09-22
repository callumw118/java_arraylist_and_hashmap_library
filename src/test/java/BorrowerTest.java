import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book bookToBorrow;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        bookToBorrow = new Book("Fellowship of the Ring", "J.R.R Tolkein", "Fantasy");
        library = new Library(1);
        library.addBook(bookToBorrow);
    }

    @Test
    public void hasNoCurrentBooksBorrowed(){
        assertEquals(0, borrower.getBorrowedCount());
    }

    @Test
    public void canBorrowBookFromLibrary(){
        borrower.borrowBook(bookToBorrow);
        library.removeBook(bookToBorrow);
        assertEquals(1, borrower.getBorrowedCount());
        assertEquals(0, library.getBookCount());
    }
}
