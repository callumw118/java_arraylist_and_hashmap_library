import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Library fullLibrary;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        library = new Library(10);
        fullLibrary = new Library(1);
        book1 = new Book("Fellowship of the Ring", "J.R.R Tolkein", "Fantasy");
        book2 = new Book("The Two Towers", "J.R.R Tolkein", "Fantasy");
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canOnlyAddOneBookAsCapacityOfLibraryIsOne(){
        fullLibrary.addBook(book1);
        fullLibrary.addBook(book2);
        assertEquals(1, fullLibrary.getBookCount());
    }
}
