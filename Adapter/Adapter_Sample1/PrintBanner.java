//교환장치 (Adapter 역할) - 상속
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }
    //Print 인터페이스의 추상메소드를 구현
    public void printWeak() {
        showWithParen();
    }
    //Print 인터페이스의 추상메소드를 구현
    public void printStrong() {
        showWithAster();
    }
}
