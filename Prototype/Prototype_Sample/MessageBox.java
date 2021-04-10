import framework.*;

public class MessageBox implements Product {
    private char decochar;
    
    public MessageBox(char decochar) {
        this.decochar = decochar;
    }
    
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " "  + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }
    
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();	// 인스턴스 복제
        } catch (CloneNotSupportedException e) {	// Cloneable 인터페이스가 구현되고 있지 않은 경우 발생
            e.printStackTrace();
        }
        return p;
    }
}
