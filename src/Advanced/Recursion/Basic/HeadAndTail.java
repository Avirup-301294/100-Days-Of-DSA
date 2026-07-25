package Recursion.Basic;

public class HeadAndTail {
    public void headRecursion(int n) {
        if (n > 0){
            headRecursion(n-1);
            System.out.println(n + " ");
        }
    }
    public void tailRecursion(int n) {
        if(n == 0) return;
        System.out.println(n + " ");
        tailRecursion(n-1);
    }

    public static void main(String[] args) {
        HeadAndTail headAndTail = new HeadAndTail();

        headAndTail.headRecursion(5);
        System.out.println("---");
        headAndTail.tailRecursion(5);
    }
}
