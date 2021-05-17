public class SideBorder extends Border {
    private char borderChar;    
    
    public SideBorder(Display display, char ch) {   
        super(display);
        this.borderChar = ch;
    }
    
    // 문자열 양 옆에 특수문자 '|'가 추가되므로
    public int getColumns() {                      
        return 1 + display.getColumns() + 1;
    }
    
    public int getRows() {                        
        return display.getRows();
    }
    
    public String getRowText(int row) {            
        return borderChar + display.getRowText(row) + borderChar;
    }
}
