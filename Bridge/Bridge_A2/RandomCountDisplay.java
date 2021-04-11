import java.util.Random;

//'기능의 클래스 계층'에 존재. CountDisplay 클래스에 기능을 추가
public class RandomCountDisplay extends CountDisplay {
    private Random random = new Random();
    
    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }
    
    public void randomDisplay(int times) {
        multiDisplay(random.nextInt(times));	// random.nextInt(times)-0~times사이의 랜덤한 정수를 리턴. 
    }
}
