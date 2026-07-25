package BinarySearch.OnAnswers;

public class SquareRoot {
    public int squareRootN(int n) {
        int low = 0;
        int high = n;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if((mid*mid) == n) return mid;
            if((mid * mid) > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return high;
    }
    public static void main(String[] args) {
        SquareRoot squareRoot = new SquareRoot();
        System.out.println(squareRoot.squareRootN(36));
        System.out.println(squareRoot.squareRootN(28));
    }
}

//0..3..6.8,9..12..15.17,18....21...27...36