public class Singleton {
    private static Singleton singleton = new Singleton();	// static멤버로  Singleton클래스를 로드할 때 한 번만 실행됨, private이므로 외부에서 new Singleton()이런식으로 생성 X
    
    private Singleton() {	// 생성자 private                                 
        System.out.println("인스턴스를 생성했습니다.");
    }
    
    public static Singleton getInstance() {	// 인스턴스를 얻을 때 사용하는 static 메소드
        return singleton;
    }
}
