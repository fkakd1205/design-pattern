import framework.*;

public class UnderlinePen implements Product {
    private char ulchar;
    
    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }
    
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\""  + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
    }
    
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();	// 인스턴스 복제. clone()메소드는 Cloneable 인터페이스에 있는게 아니라 java.lang.Object 클래스에 있다.
        } catch (CloneNotSupportedException e) {	// Cloneable 인터페이스가 구현되고 있지 않은 경우 발생
            e.printStackTrace();
        }
        return p;
    }
}
