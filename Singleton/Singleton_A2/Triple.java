public class Triple {
    private static Triple[] triple = new Triple[]{	// private, static으로 인스턴스 3개 생성
        new Triple(0),
        new Triple(1),
        new Triple(2),
    };
    private int id;
    
    private Triple(int id) {	// 생성자 private                                 
        System.out.println("The instance " + id + " is created.");
        this.id = id;
    }
    
    public static Triple getInstance(int id) {	// 인스턴스를 얻을 때 사용하는 static 메소드    
        return triple[id];
    }
    
    public String toString() {	// Triple객체를 String으로 바꾸는
        return "[Triple id=" + id + "]";
    }
}
