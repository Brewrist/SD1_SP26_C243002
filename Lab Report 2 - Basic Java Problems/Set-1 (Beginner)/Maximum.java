// Find the maximum of 3 numbers: Take 3 numbers from user input, print the largest.

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Largest Number " + Math.max(Math.max(a, b), c));
        sc.close();
    }
}
