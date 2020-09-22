import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;

    @Before
    public void before(){
        library = new Library(10);
        book1 = new Book("Fellowship of the Ring", "J.R.R Tolkein", "Fantasy");
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }
}
