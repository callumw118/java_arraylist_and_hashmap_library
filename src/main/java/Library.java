import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getBookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if(stockHasSpace()) {
            this.books.add(book);
        }
    }

    public boolean stockHasSpace(){
        return getBookCount() < this.capacity;
    }

    public void removeBook(Book book){
        this.books.remove(book);
    }
}
