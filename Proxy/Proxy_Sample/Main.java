public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        // proxy가 처리
        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
        p.setPrinterName("Bob");
        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
        
        // 「본인」이 처리
        p.print("Hello, world.");
    }
}
