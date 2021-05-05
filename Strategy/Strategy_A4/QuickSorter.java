// 퀵 정렬
public class QuickSorter implements Sorter {
    Comparable[] data;
    
    public void sort(Comparable[] data) {
        this.data = data;
        qsort(0, data.length - 1);
    }
    
    private void qsort(int pre, int post) {
        int saved_pre = pre;
        int saved_post = post;
        Comparable mid = data[(pre + post) / 2];
        
        do {
            while (data[pre].compareTo(mid) < 0) {	// 중간값보다 date[pre]값이 더 클 때, while문 탈출
                pre++;
            }
            
            while (mid.compareTo(data[post]) < 0) {	// 중간값이 date[post]값보다 더 클 때, while문 탈출
                post--;
            }
            
            if (pre <= post) {
                Comparable tmp = data[pre];
                data[pre] = data[post];
                data[post] = tmp;
                pre++;
                post--;
            }
        } while (pre <= post);
        
        if (saved_pre < post) {
            qsort(saved_pre, post);
        }
        
        if (pre < saved_post) {
            qsort(pre, saved_post);
        }
    }
}
