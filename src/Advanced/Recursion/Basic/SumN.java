package Recursion.Basic;

public class SumN {
    public static void main(String[] args) {

        SumN sumN = new SumN();
        System.out.println(sumN.sumOfNHead(5));
        System.out.println(sumN.sumOfNTail(5));
    }

    private int sumOfNHead(int n) {
        if(n > 0) {
            return n + sumOfNHead(n-1);
        }

        return 0;
    }

    private int sumOfNTail(int n) {
        if(n == 0) {
            return 0;
        }

        return n + sumOfNTail(n-1);
    }
}
