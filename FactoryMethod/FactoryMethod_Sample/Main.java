import framework.*;
import idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        
        Product card1 = factory.create("홍길동");	// new IDCard()로 생성하지 않고, IDCardFactory를 경유하여 생성
        Product card2 = factory.create("이순신");
        Product card3 = factory.create("강감찬");
        
        card1.use();
        card2.use();
        card3.use();
    }
}
