import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;
    
    public WinningStrategy(int seed) {
        random = new Random(seed);	// seed number가 달라져야 random number가 generate하는 순서가 달라짐. (만약 seed가 항상 100이라면 항상 같은 숫자가 패턴대로 나옴)
    }
    
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }
    
    public void study(boolean win) {
        won = win;
    }
}
