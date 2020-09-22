import org.junit.Before;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Fellowship of the Ring", "J.R.R Tolkein", "Fantasy");
    }
}
