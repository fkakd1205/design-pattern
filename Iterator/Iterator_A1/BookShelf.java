import java.util.ArrayList;

//서가를 나타내는 클래스
//이 클래스만 변경하면 서가의 크기를 초과해서 책을 넣을 수 있다.
public class BookShelf implements Aggregate {
    private ArrayList books;   //Book[] books -> ArrayList books
    
    public BookShelf(int initialsize) {  
        this.books = new ArrayList(initialsize);
    }                                           
    public Book getBookAt(int index) {
        return (Book)books.get(index);  
    }
    public void appendBook(Book book) {
        books.add(book);
    }
    public int getLength() {
        return books.size();
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
