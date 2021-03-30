//하나씩 열거하면서 스캔을 실행하는 인터페이스
public interface Iterator {
    public abstract boolean hasNext();
    public abstract Object next();
}
