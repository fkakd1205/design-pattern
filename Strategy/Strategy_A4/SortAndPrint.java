public class SortAndPrint {
    Comparable[] data;
    Sorter sorter;
    
    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }
    
    public void execute() {
        print();	// 현재 data 출력
        sorter.sort(data);
        print();	// 오름차순 정렬 후 data 출력
    }
    
    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println("");
    }
}
