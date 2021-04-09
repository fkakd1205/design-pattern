public class Singleton {
    private static Singleton singleton = null;
    
    private Singleton() {	// 생성자 private
        System.out.println("인스턴스를 생성했습니다.");
        slowdown();                             
    }
    
    public static synchronized Singleton getInstance() {	// 인스턴스를 얻을 때 사용하는 static 메소드, synchronized로 동시에 두 개 이상의 스레드가 메소드 안으로 들어오지 못하도록 함
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
    
    private void slowdown() {	// 지정된 시간 동안 현재 스레드를 일시 중단                   
        try {                                   
            Thread.sleep(1000);                 
        } catch (InterruptedException e) {      
        }                                       
    }                                           
}
