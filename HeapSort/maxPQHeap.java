package HeapSort;
public class maxPQHeap implements maxPQ {

    private final Element[] A;
    public int heapSize = 0;

    public maxPQHeap(int maxElms) {
        this.A = new Element[maxElms];
    }
    @Override
    public Element extractMax() {
        Element max = A[0];
        A[0] = A[--heapSize];
        maxHeapify(0);

        return max;
    }
    @Override
    public void insert(Element e) {
        int i = heapSize++;
        A[i] = e;
        int p = parent(i);

        while (i > 0 && A[p].key < A[i].key) {
           swap(i, p);
           i = p;
           p = parent(i);
        }
    }
    public void maxHeapify(int i) {
        int[] children = {
            left(i),
            right(i)
        };
        for(int j : children){
           if(j >= heapSize) {
               return;
           }
           if(A[j].key >= A[i].key){
                swap(j,i);
               maxHeapify(j);
            }
        }
    }
    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return left(i) + 1;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    public void swap(int i, int j){
            Element temp = A[i];
            A[i] = A[j];
            A[j] = temp;
    }
}