public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;		// 현재의 수
    private int end;    // 종료값(이 값을 포함하지 않는다)
    private int inc;	// 증가분
    
    public IncrementalNumberGenerator(int start, int end, int inc) {
        this.number = start;
        this.end = end;
        this.inc = inc;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void execute() {
        while (number < end) {
            notifyObservers();
            number += inc;
        }
    }
}
