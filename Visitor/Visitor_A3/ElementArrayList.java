import java.util.ArrayList;
import java.util.Iterator;

class ElementArrayList<Entry> extends ArrayList<Entry> implements Element {
    public void accept(Visitor v) {
        Iterator<Entry> it = iterator();
        
        while (it.hasNext()) {
            Element e = (Element)it.next();
            e.accept(v);
        }
    }
}
