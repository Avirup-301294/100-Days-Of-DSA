package Basics.Maths;

public class PerfectNumber {
    public static void main(String[] args) {
        int n1 = 6, n2 = 4, n3= 28, n4 = 123;

        System.out.println("Brute");
        System.out.println(isPerfect(n1));
        System.out.println(isPerfect(n2));
        System.out.println(isPerfect(n3));
        System.out.println(isPerfect(n4));

        System.out.println("\n\nOptimal");
        System.out.println(isPerfectOptimal(n1));
        System.out.println(isPerfectOptimal(n2));
        System.out.println(isPerfectOptimal(n3));
        System.out.println(isPerfectOptimal(n4));
    }

    // Brute
    public static boolean isPerfect(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if((n % i) == 0) {
                // proper divisors
                sum += i;
            }
        }

        return sum == n;
    }

    // Optimal
    public static boolean isPerfectOptimal(int n) {
        int sum = 0;
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if((n % i) == 0) {
                // proper divisors
                sum += i;
                if (n / i != n && i != n / i) {
                    sum = sum + (n / i);
                }
            }
        }

        return sum == n;
    }
}
