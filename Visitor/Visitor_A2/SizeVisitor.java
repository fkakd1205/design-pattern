import java.util.Iterator;

public class SizeVisitor extends Visitor {
    private int size = 0;
    
    public int getSize() {
        return size;
    }
    
    // 메소드 오버로드
    // 파일에 대한 visit
    public void visit(File file) {
        size += file.getSize();
    }
    
    // 디렉토리에 대한 visit
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
    }
}
