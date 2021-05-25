import java.util.Iterator;
import java.util.ArrayList;

public class FileFindVisitor extends Visitor {
    private String filetype;
    private ArrayList<Entry> found = new ArrayList<Entry>();
    
    public FileFindVisitor(String filetype) {           // “.txt”와 같이 확장자를 .붙여 지정
        this.filetype = filetype;
    }
    
    public Iterator<Entry> getFoundFiles() {                 // 발견한 파일을 얻는다
        return found.iterator();
    }
    
    public void visit(File file) {                      // 파일을 방문할 때 호출된다
        if (file.getName().endsWith(filetype)) {	// endsWith(String)는 해당 String 객체가 인자로 전달된 String으로 끝난다면 true, 그렇지 않다면 false
            found.add(file);
        }
    }
    
    public void visit(Directory directory) {            //디렉터리를 방문할 때 호출된다
        Iterator<Entry> it = directory.iterator();    
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
    }
}
