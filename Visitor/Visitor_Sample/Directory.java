import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
    private String name;      // 디렉터리의 이름               
    private ArrayList<Entry> dir = new ArrayList<Entry>();	// 디렉터리 엔트리의 집합
    
    public Directory(String name) {    // 생성자     
        this.name = name;
    }
    
    public String getName() {		// 이름을 얻는다               
        return name;
    }
    
    public int getSize() {		// 사이즈를 얻는다 
        int size = 0;
        Iterator<Entry> it = dir.iterator();
        
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }
    
    public Entry add(Entry entry) {		// 엔트리의 추가     
        dir.add(entry);
        return this;
    }
    
    public Iterator<Entry> iterator() {             
        return dir.iterator();
    }
    
    public void accept(Visitor v) {         // 방문자 승낙
        v.visit(this);              
    }                           
}
