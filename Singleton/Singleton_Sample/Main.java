public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();	// obj2는 obj1과 같은 객체를 리턴
        
        if (obj1 == obj2) {	// obj1.equals(obj2)라면? 값이 동일하므로 true
            System.out.println("obj1과 obj2는 같은 인스턴스입니다.");
        } else {
            System.out.println("obj1과 obj2는 같은 인스턴스가 아닙니다.");
        }
        System.out.println("End.");
    }
}
