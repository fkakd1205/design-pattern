import java.util.Iterator;

public abstract class Entry implements Element {	// implements 했지만 아직 추상클래스.
    public abstract String getName();                                 
    public abstract int getSize();
    
    public Entry add(Entry entry) throws FileTreatmentException {      
        throw new FileTreatmentException();
    }
    
    public Iterator<Entry> iterator() throws FileTreatmentException {   
        throw new FileTreatmentException();
    }
    
    // Template Method 패턴 사용
    public String toString() {                                       
        return getName() + " (" + getSize() + ")";
    }
}
