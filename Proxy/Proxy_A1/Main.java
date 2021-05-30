public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice", "Printer"); 	// 클래스 이름을 문자열로 전달                
        // proxy가 처리
        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
        p.setPrinterName("Bob");
        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
        
        // 「본인」이 처리
        p.print("Hello, world.");
    }
}
