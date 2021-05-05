public class Hand {
    public static final int HANDVALUE_GUU = 0;  // 주먹을 표시하는 값
    public static final int HANDVALUE_CHO = 1;  // 가위를 표시하는 값
    public static final int HANDVALUE_PAA = 2;  // 보를 표시하는 값
    
    public static final Hand[] hand = {         // 가위바위보의 손을 표시하는 3개의 인스턴스 (Singleton 패턴)
        new Hand(HANDVALUE_GUU),
        new Hand(HANDVALUE_CHO),
        new Hand(HANDVALUE_PAA),
    };
    
    private static final String[] name = {        // 가위바위보의 손의 문자열 표현
        "주먹", "가위", "보",
    };
    
    private int handvalue;                     // 가위바위보의 손의 값
    private Hand(int handvalue) {	// 생성자를 private로 해서 다른 클래스에서 new Hand()로 객체 생성 방지
        this.handvalue = handvalue;
    }
    
    public static Hand getHand(int handvalue) {  // 값에서 인스턴스를 얻는다
        return hand[handvalue];
    }
    
    public boolean isStrongerThan(Hand h) {     // this가 h를 이길 경우 true
        return fight(h) == 1;
    }
    
    public boolean isWeakerThan(Hand h) {       // this가 h에게 질 경우 true
        return fight(h) == -1;
    }
    
    private int fight(Hand h) {                 // 무승부는 0, this의 승이면 1, h의 승이면 -1
        if (this == h) {	// Hand클래스는 객체를 딱 3개만 만드니까, 만약 this와 h의 handvalue가 0이라면 둘 다 같은 객체의 메모리 주소를 가리키고 있는 것이다
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }
    
    public String toString() {                  // 문자열 표현으로 변환
        return name[handvalue];
    }
}
