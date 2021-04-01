//(Client역할)
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");	//Print를 사용해 PrintBanner 생성
        p.printWeak();
        p.printStrong();
    }
}
