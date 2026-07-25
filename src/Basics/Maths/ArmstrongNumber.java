package Basics.Maths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n1 = 153, n2 = 12, n3 = 234, n4 = 370;
        System.out.println(isArmstrong(n1));
        System.out.println(isArmstrong(n2));
        System.out.println(isArmstrong(n3));
        System.out.println(isArmstrong(n4));
    }

    public static boolean isArmstrong(int n) {
        int temp = n;
        int digit = 0;
        int cDig = countDigits(n);
        while(n > 0) {
            int rem = n % 10;
            digit += Math.pow(rem, cDig);
            n /= 10;
        }

        return temp == digit;
    }

    public static int countDigits(int n) {
        if(n == 0) return 1;
        int count = (int) (Math.log10(n) + 1);
        return count;
    }
}
