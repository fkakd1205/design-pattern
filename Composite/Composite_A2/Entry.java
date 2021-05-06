public abstract class Entry {
    protected Entry parent;		// full path를 얻기 위한 부모 엔트리
    public abstract String getName();
    public abstract int getSize();
    
    // File클래스에서 엔트리가 추가되는것을 막기 위함.
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    
    public void printList() {
        printList("");
    }
    
    protected abstract void printList(String prefix);
    
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
    
    public String getFullName() {                       
        StringBuffer fullname = new StringBuffer();
        Entry entry = this;
        
        do {
            fullname.insert(0, "/" + entry.getName());	// StringBuffer의 0번 인덱스에 부모 이름 삽입
            entry = entry.parent;	// 부모 엔트리의 부모를 찾기 위해
        } while (entry != null);
        
        return fullname.toString();
    }
}
