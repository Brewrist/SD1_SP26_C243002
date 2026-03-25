// Sum of all numbers from 1 to N

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum (1 to " + n + ") = " + (n*(n+1))/2);
        sc.close();
    }
}
