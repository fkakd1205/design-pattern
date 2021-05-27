public class DigitObserver implements Observer {
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        
        try {
            Thread.sleep(100);	// 0.1초 동안 sleep
        } catch (InterruptedException e) {
        }
    }
}
