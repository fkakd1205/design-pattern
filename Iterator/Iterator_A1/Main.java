import java.util.*;

public class Main {
    public static void main(String[] args) {
    	//최초에 지정한 서가의 크기는 4지만, ArrayList를 사용해 서가의 크기를 초과해도 책을 넣을 수 있다.
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("East of Eden"));
        bookShelf.appendBook(new Book("Frankenstein"));
        bookShelf.appendBook(new Book("Gulliver's Travels"));
        bookShelf.appendBook(new Book("Hamlet"));
        bookShelf.appendBook(new Book("Chaeeun's cat"));
        
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
