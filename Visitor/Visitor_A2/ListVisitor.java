import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentdir = "";
    
    // 메소드 오버로드
    // 파일에 대한 visit
    public void visit(File file) {                 
        System.out.println(currentdir + "/" + file);
    }
    
    // 디렉토리에 대한 visit
    public void visit(Directory directory) {   
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;	// 다시 위로 돌아오기 위해
        currentdir = currentdir + "/" + directory.getName();
        Iterator<Entry> it = directory.iterator();
        
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);		// visit 메소드를 호출한 ListVisitor 객체
        }
        currentdir = savedir;	// 다시 위로 돌아오기 위해
    }
}
