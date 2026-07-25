package Sorting.Uncommon;

public class ShellSort {

    /**
     * Sorts an array of integers using the Shell Sort algorithm.
     *
     * @param arr The array to be sorted.
     */
    public void sort(int[] arr) {
        int n = arr.length;

        // Start with a large gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform a gapped insertion sort for this gap size.
            // The first 'gap' elements arr[0...gap-1] are already in gapped order.
            // We then add one more element at a time until the entire array is gap sorted.
            for (int i = gap; i < n; i += 1) {
                // Store arr[i] in 'temp' and create a hole at position 'i'
                int temp = arr[i];

                // Shift earlier gap-sorted elements up until the correct location for 'temp' is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                // Put 'temp' (the original arr[i]) in its correct location
                arr[j] = temp;
            }
        }
    }

    // Main method for testing the Shell Sort
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3, 78, 1, 99, 45, 6};
        System.out.println("Array before sorting:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        ShellSort sorter = new ShellSort();
        sorter.sort(arr);

        System.out.println("Array after sorting:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
