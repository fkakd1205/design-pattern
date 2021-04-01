//제공되고 있는 것 (Adaptee 역할)
public class Banner {
    private String string;
    public Banner(String string) {
        this.string = string;
    }
    //Print 클래스의 메소드를 오버라이딩
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }
    //Print 클래스의 메소드를 오버라이딩
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
