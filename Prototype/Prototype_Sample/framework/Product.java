package framework;
import java.lang.Cloneable;		// 단지 clone에 의해 복사할 수 있다는 표시로 사용. 여기에 clone()메소드가 있는게 아니다.

public interface Product extends Cloneable {	// Cloneable 인터페이스를 상속 -> 이제 Product 클래스나 상속받는 하위 클래스들에서 clone()메소드 사용 가능
    public abstract void use(String s);		// 사용하기 위한 것. 무엇을 의미하는지는 하위 클래스의 구현에 맡겨져 있음
    public abstract Product createClone();
}
