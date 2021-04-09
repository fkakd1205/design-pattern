public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker singleton = new TicketMaker();   // static멤버로  TicketMaker클래스를 로드할 때 한 번만 실행됨, private이므로 외부에서 new TicketMaker()이런식으로 생성 X
    
    private TicketMaker() {	// 생성자 private                                  
    }                      
    
    public static TicketMaker getInstance() {	// 인스턴스를 얻을 때 사용하는 static 메소드                       
        return singleton;                                           
    }                 
    
    //synchronized로 멀티스레드 제어
    public synchronized int getNextTicketNumber() {    // 한 스레드가 getNextTickeyNumber()메소드 호출하여 실행 시, 다른 스레드가 이 메소드를 호출하면 이전 메소드 실행이 완료될 때까지 기다려야 함             
        return ticket++;
    }
}
