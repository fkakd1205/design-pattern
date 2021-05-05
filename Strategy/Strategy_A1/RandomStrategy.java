import java.util.Random;

public class RandomStrategy implements Strategy {
    private Random random;
    
    public RandomStrategy(int seed) {
        random = new Random(seed);
    }
    
    public void study(boolean win) {	// 랜덤하게 가위바위보를 내니까 학습이 필요 x.
    }
    
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }
}
