package Arrays.FAQs_Medium;

public class PascalTriangleI {
    public static void main(String[] args) {
        int r1 = 4, c1 = 2, r2 = 5, c2 = 3;
        System.out.println(pascalTriangleI(r1, c1));
        System.out.println(pascalTriangleI(r2, c2));
    }

    public static int pascalTriangleI(int r, int c) {
        return nCr(r-1, c-1);
    }

    private static int nCr(int n, int r) {
        int val_at_r_c = 1;

        if(r > n-r) r = n-r; // nCr = nCn-r => 7C4 = 7C3
        if(r == 1) return n;

        // nCr = { n! / [r! * (n-r)!] }
        // 10C3 = (10 x 9 x 8) / (3 x 2 x 1)

        for(int i = 0; i < r; i++) {
            val_at_r_c *= (n - i);
            val_at_r_c /= (i + 1);
        }
        return val_at_r_c;
    }
}
