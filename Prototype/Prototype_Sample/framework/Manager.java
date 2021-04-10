package framework;
import java.util.*;

public class Manager {
    private HashMap<String, Product> showcase = new HashMap<String, Product>();
    
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }
    
    public Product create(String protoname) {	// 여기서 protoname은 HashMap의 key값
        Product p = (Product)showcase.get(protoname);
        
        return p.createClone();	// 어떤 클래스의 createClone()이 실행되는지 여기서는 알 수 없다.
    }
}
