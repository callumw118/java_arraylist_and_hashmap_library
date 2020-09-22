import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;
    HashMap<String, Integer> genres;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
        this.genres = new HashMap<>();
    }

    public int getBookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if(stockHasSpace()) {
            this.books.add(book);
            addGenre(book);
        }
    }

    public boolean stockHasSpace(){
        return getBookCount() < this.capacity;
    }

    public void removeBook(Book book){
        this.books.remove(book);
    }

    public void addGenre(Book book){
        String genre = book.getGenre();
        if(genreDoesNotExist(book)) {
            this.genres.put(genre, 1);
        }else{
            int total = getNumberOfSameGenre(genre);
            this.genres.put(genre, total + 1);
        }
    }

    public boolean genreDoesNotExist(Book book){
        return this.genres.get(book.getGenre()) == null;
    }

    public int getGenreCount(){
        return this.genres.size();
    }

    public int getNumberOfSameGenre(String genre){
        return this.genres.get(genre);
    }
}
