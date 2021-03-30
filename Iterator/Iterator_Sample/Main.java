import java.util.*;

public class Main {
    public static void main(String[] args) {
    	//최초에 지정한 서가의 크기만큼 책을 넣을 수 있다.
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
      //bookShelf.appendBook(new Book("Chaeeun's cat")); -> ArrayIndexOutOfBoundsException
        
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
