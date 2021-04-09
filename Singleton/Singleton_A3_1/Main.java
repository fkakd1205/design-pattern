public class Main extends Thread {
    public static void main(String[] args) {
        System.out.println("Start.");
        new Main("A").start();
        new Main("B").start();
        new Main("C").start();
        System.out.println("End.");
    }
    
    public void run() {
        Singleton obj = Singleton.getInstance();	// 3개의 다른 인스턴스가 리턴됨
        System.out.println(getName() + ": obj = " + obj);	
    }
    
    public Main(String name) {
        super(name);
    }
}
