package idcard;
import framework.*;

public class IDCard extends Product {
    private String owner;
    
    // 생성자의 접근지정자는 default, 같은 패키지(idcard)내에서만 객체 생성 가능.
    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }
    
    public void use() {
        System.out.println(owner + "의 카드를 사용합니다.");
    }
    
    public String getOwner() {
        return owner;
    }
}
