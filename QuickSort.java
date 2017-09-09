public class QuickSort {
    public static void main(String[] args){
        int[] A = {6,3,2,8,9,0,1,3,4,5,32,22,0,2,14};
        System.out.println("Unsorted Array:");
        printArray(A);

        QuickSort(A, 0, A.length-1);
        System.out.println("\nSorted Array:");
        printArray(A);

        // Print asymptotic notation for the algorithm.
        System.out.println("\n:: Running time of QuickSort ::");
        System.out.println("Best case: Ω(n log(n))\n" +
                "Average case: Θ(n log(n))\n" +
                "Worst case: O(n log(n))");
    }

    public static void QuickSort(int[] A, int p, int r){
        if (p < r){
            int q = Partition(A, p, r);
            QuickSort(A, p, q-1);
            QuickSort(A,q+1,r);
        }
    }

    private static int Partition(int[] A, int p, int r){
        int x = A[r];
        int i = p - 1;

        for(int j = p; j <= r - 1; j++){
            if (A[j] <= x){
                i = i + 1;
                // swap
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        //swap
        int temp1 = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp1;

        return i+1;
    }

    public static void printArray(int[] A){
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println("");
    }
}
