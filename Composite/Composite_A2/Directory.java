import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;                            // 디렉터리의 이름
    private List<Entry> directory = new ArrayList<Entry>();      // 디렉터리 엔트리의 집합
    
    public Directory(String name) {                 
        this.name = name;
    }
    
    public String getName() {                       // 이름을 얻는다
        return name;
    }
    
    public int getSize() {                            // 크기를 얻는다
        int size = 0;
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }
    
    public Entry add(Entry entry) {                  // 엔트리의 추가
        directory.add(entry);
        entry.parent = this;	// 현재 엔트리를, 추가되는 엔트리의 부모로 지정
        return this;
    }
    
    protected void printList(String prefix) {           // 엔트리의 일람
        System.out.println(prefix + "/" + this);
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
