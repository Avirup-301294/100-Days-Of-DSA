package Basics.Recursion;

public class CheckNumberIsPrime {
    public static void main(String[] args) {
        int n1 = 2, n2 = 3, n3 = 25;
        System.out.println(checkPrime(n1));
        System.out.println(checkPrime(n2));
        System.out.println(checkPrime(n3));
    }

    public static boolean checkPrime(int num) {
        if(num <= 1) return false;
        return isPrime(num, 2);
    }

    private static boolean isPrime(int num, int i) {
        if(i*i > num) return true;
        if(num % i == 0) return false;
        return isPrime(num, i+1);
    }
}
