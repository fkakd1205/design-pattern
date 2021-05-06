public abstract class Entry {
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
}
