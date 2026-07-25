package Recursion.Basic;

public class SumOfArrayElements {
    long getSumOfArrayElements(int[] arr, int size) {
        if(size == 1) return arr[0];

        return arr[size-1] + getSumOfArrayElements(arr, size-1);
    }
    public static void main(String[] args) {
        SumOfArrayElements sumOfArrayElements = new SumOfArrayElements();
        long sum = sumOfArrayElements.getSumOfArrayElements(new int[]{1,2,3,4,5,6,7,8,9,10}, 10);
        System.out.println(sum);
    }
}
