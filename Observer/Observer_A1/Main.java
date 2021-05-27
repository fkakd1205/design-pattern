public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);	// 10, 15, 20, ..., 35, 45
        
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
