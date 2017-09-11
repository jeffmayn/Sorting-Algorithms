package HeapSort;
import java.util.Scanner;

public class Heapsort {
    public static void main(String[] args) {

    	/*
		To run heapsort with either max or min priority queue, just
		comment out the one, and enable the other.
		 */

			minPQ pq = new minPQHeap(1000);
			//maxPQ pq = new maxPQHeap(1000);

	int n = 0;
	int i;
	Scanner sc = new Scanner(System.in);
	while (sc.hasNextInt()) {
	    i = sc.nextInt();
	    n++;
	    pq.insert(new Element(i,null));

       }

	while (n > 0){

		/*
		To run heapsort with either max or min priority queue, just
		comment out the one, and enable the other.
		 */

	    System.out.println(pq.extractMin().key);
		//System.out.println(pq.extractMax().key);
	    n--;
	}
   }
}
