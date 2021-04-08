package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<String>();
    
    protected Product createProduct(String owner) {
        return new IDCard(owner);	// IDCard클래스와 같은 패키지(idcard)에 있으므로 객체 생성 가능.
    }
    
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());	// owner 리스트에 추가
    }
    
    public List<String> getOwners() {
        return owners;	// 전체 owner들을 리턴
    }
}
