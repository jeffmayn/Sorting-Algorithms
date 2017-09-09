public class Main {

    public static void main(String[] args) {
        int[] A = {6,3,2,8,9,0,1,3,4,5,32,22,0,2,14};

        // Run insertion sort algorithm on array A, and print it.
        InsertionSort(A);
        printSortedArray(A);

        // Print asymptotic notation for the algorithm.
        System.out.println("\n\n:: Running time of insertion sort ::");
        System.out.println("Best case: Ω(n)\n" +
                            "Average case: Θ(n^2)\n" +
                            "Worst case: O(n^2)");
    }

    public static void InsertionSort(int[] A){
        System.out.println("Unsorted Array:");
        for (int j = 1; j < A.length; j++){
            System.out.print(A[j] + " ");
            int key = A[j];
            int i = j - 1;

            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
        System.out.println("\n\nSorted Array:");
    }
    public static void printSortedArray(int[] A){
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
    }
}
