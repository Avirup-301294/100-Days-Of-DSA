package Recursion.Basic;

public class SumOfDigit {
    public static void main(String[] args) {
        SumOfDigit sumOfDigit = new SumOfDigit();
        int num = 90;
        System.out.println(sumOfDigit.addDigit(num, 0));

    }

    private int addDigit(int num, int sum) {
        if(num <= 0) return sum;
        sum += num % 10;
        return addDigit(num/10, sum);
    }
}
