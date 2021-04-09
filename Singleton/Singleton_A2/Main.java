public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        
        for (int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstance(i % 3);	// (0, 1, 2) 3개의 인스턴스만 호출
            System.out.println(i + ":" + triple);
        }
        
        System.out.println("End.");
    }
}
