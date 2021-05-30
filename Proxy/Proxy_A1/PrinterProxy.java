public class PrinterProxy implements Printable {
    private String name;            // 이름
    private Printable real;           // 「본인」                 
    private String className;       // 「본인」의 클래스명    
    
    public PrinterProxy(String name, String className) {      // 생성자     
        this.name = name;
        this.className = className;		// 문자열로 클래스 이름을 전달받음                                                 
    }
    
    public synchronized void setPrinterName(String name) {  // 이름 설정
        if (real != null) {
            real.setPrinterName(name);  // 「본인」에게도 설정한다
        }
        this.name = name;
    }
    
    public String getPrinterName() {    // 이름 취득
        return name;
    }
    
    public void print(String string) {  // 표시
        realize();
        real.print(string);
    }
    
    private synchronized void realize() {   // 「본인」을 생성
        if (real == null) {
            try {                                                                       
                real = (Printable)Class.forName(className).newInstance();   // 인수 없는 생성자 호출            
                real.setPrinterName(name);		// name을 지정해 줘야 된다                                              
            } catch (ClassNotFoundException e) {                                        
                System.err.println("클래스 " + className + " 가 발견되지 않습니다.");      
            } catch (Exception e) {                                                     
                e.printStackTrace();                                                    
            }                                                                           
        }
    }
}
