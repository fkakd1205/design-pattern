public abstract class Visitor {
	// 메소드 오버로드
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
