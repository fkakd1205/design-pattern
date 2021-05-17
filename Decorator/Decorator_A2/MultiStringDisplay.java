import java.util.*;

public class MultiStringDisplay extends Display {
    private List<String> body = new ArrayList<String>();       // 표시 문자열
    private int columns = 0;                      // 최대 문자수
    
    public void add(String msg) {                 // 문자열 추가
        body.add(msg);
        updateColumn(msg);
    }
    
    public int getColumns() {                     // 문자 수
        return columns;
    }
    
    public int getRows() {                         // 행 수
        return body.size();
    }
    
    public String getRowText(int row) {            // 행의 내용
        return (String)body.get(row);
    }
    
    private void updateColumn(String msg) {      // 문자수를 변경한다
        if (msg.getBytes().length > columns) {	 // 길이가 가장 긴 문자열을 찾는다.
            columns = msg.getBytes().length;
        }
        for (int row = 0; row < getRows(); row++) {	// body.size()는 문자열의 행 수
            int fills = columns - ((String)body.get(row)).getBytes().length;
            if (fills > 0) {
                body.set(row, body.get(row) + spaces(fills));	// 문자열 뒤에 공백 문자를 채운다.
            }
        }
    }
    
    private String spaces(int count) {             // 인자로 넘어오는 count만큼 공백 추가
        StringBuffer buf = new StringBuffer();
        
        for (int i = 0; i < count; i++) {
            buf.append(' ');
        }
        
        return buf.toString();
    }
}
