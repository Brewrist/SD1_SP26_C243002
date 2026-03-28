/*You are given 2 integers - A and C. You need to find if there exists any integer B that
meets the following condition
-B must be an integer
-B is the average of A and C */

import java.util.Scanner;

public class avgAnC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n + m % 2 == 0) {
            System.out.println("YES. The average of " + n + " and " + m + " is an Integer. " + (n + m) / 2);
        }
        else {
            System.out.println("No. The average of " + n + " and " + m + " is not an Integer.");
        }
        sc.close();
    }
}
