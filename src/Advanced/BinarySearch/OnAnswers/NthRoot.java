package BinarySearch.OnAnswers;

public class NthRoot {
    public int nthRoot(int n, int m) {
        int low = 0;
        int high = m;

        while(low <= high) {
            int mid = low + (high-low)/2;
            int ans = helper(n, mid, m);

            if(ans == 1) return mid;
            else if(ans == 2) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public int helper(int N, int mid, int M) {  // 3, 3, 27
        int val = 1;
        for(int i = 1; i <= N; i++) {
            val *= mid;
            if(val > M) return 2;
        }

        if(val == M) return 1;
        return 0;
    }
    public static void main(String[] args) {
        NthRoot nthRoot = new NthRoot();
        System.out.println(nthRoot.nthRoot(3, 27));
        System.out.println(nthRoot.nthRoot(4, 69));
    }
}

//0..3..6.8,9..12..15.17,18....21...27...36