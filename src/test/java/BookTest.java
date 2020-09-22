import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Fellowship of the Ring", "J.R.R Tolkein", "Fantasy");
    }

    @Test
    public void canGetTitle(){
        assertEquals("Fellowship of the Ring", book.getTitle());
    }
}
