public class StringDisplay extends Display {
    private String string;
    
    public StringDisplay(String string) {           
        this.string = string;
    }
    
    public int getColumns() {                      
        return string.getBytes().length;
    }
    
    // 입력된 문자열은 하나의 행으로 만들어짐.
    public int getRows() {                         
        return 1;
    }
    
    public String getRowText(int row) {            
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
