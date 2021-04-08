package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private HashMap<Integer, String> database = new HashMap<Integer, String>();
    private int serial = 100;
    
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);	// IDCard클래스와 같은 패키지(idcard)에 있으므로 객체 생성 가능.
    }
    
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        database.put(new Integer(card.getSerial()), card.getOwner());	// database 해시맵에 추가
    }
    
    public HashMap<Integer, String> getDatabase() {
        return database;
    }
}
