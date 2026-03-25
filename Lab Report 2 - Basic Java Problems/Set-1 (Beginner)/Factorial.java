// Calculate the factorial of a number. Example: 5! = 5 × 4 × 3 × 2 × 1 = 120

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fac = 1;
        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if(i!=1)System.out.print(" x ");
            fac*=i;
        }
        System.out.print(" = " + fac);
        sc.close();
    }
}
