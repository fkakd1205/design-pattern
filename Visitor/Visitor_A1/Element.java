public interface Element {
    public abstract void accept(Visitor v);		// 데이터 구조 Element는 이 Visitor의 방문을 허락하겠다
}
