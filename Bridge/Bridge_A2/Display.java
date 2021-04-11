// '기능의 클래스 계층'의 최상위 클래스
public class Display {
    private DisplayImpl impl;	// Display의 구현을 나타내는 인스턴스()
    
    public Display(DisplayImpl impl) {	// 생성자에 구현을 나타내는 클래스의 인스턴스를 전달받음
        this.impl = impl;	// 인수로 전달된 인스턴스는 imple필드에 저장되어 이후에 처리할 때 사용 (이 필드가 두 계층의 '다리'역할)
    }
    
    public void open() {
        impl.rawOpen();
    }
    
    public void print() {
        impl.rawPrint();
    }
    
    public void close() {
        impl.rawClose();
    }
    
    public final void display() {
        open();
        print();                    
        close();
    }
}
