/*You are given three digits, a, b, and c. Two of them are equal, but the third one is
different from the other two.
Find the value that occurs exactly once */

import java.util.Scanner;

public class oddOneOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b) {
            System.out.println(c);
        }
        if (a == c) {
            System.out.println(b);
        }
        if (c == b) {
            System.out.println(a);
        }
        sc.close();
    }
}
