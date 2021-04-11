// '기능의 클래스 계층'에 존재. Display 클래스에 기능을 추가
public class CountDisplay extends Display {
	
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    
    public void multiDisplay(int times) {       // times회 반복해서 표시하기
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
