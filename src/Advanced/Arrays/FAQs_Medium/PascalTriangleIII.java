package Arrays.FAQs_Medium;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleIII {
    public static void main(String[] args) {
        int n1 = 4, n2 = 5;
        System.out.println(pascalTriangleIII(n1));
        System.out.println(pascalTriangleIII(n2));
    }

    public static List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> ls = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            List<Integer> inner = new ArrayList<>();
            int val = 1;
            inner.add(1);
            for (int j = 1; j < i; j++) {
                val = (inner.get(j-1) * (i - j)) / j;
                inner.add(val);
            }
            ls.add(inner);
        }

        return ls;
    }
}
