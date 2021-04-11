// '기능의 클래스 계층'에 존재. Display 클래스에 기능을 추가
public class IncreaseDisplay extends CountDisplay {
    private int step;	// 증가수
    
    public IncreaseDisplay(DisplayImpl impl, int step) {
        super(impl);
        this.step = step;
    }
    
    // 표시할 문자의 개수를 늘려가는
    public void increaseDisplay(int level) {
        int count = 0;
        for (int i = 0; i < level; i++) {
            multiDisplay(count);
            count += step;
        }
    }
}
