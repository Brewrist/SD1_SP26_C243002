/*You are given 3 numbers A, B, and C. Determine whether the average of A and B is
strictly greater than C or not?
NOTE: Average of A and B is defined as (A+B)/2. For example, the average of 5 and 9 is
7, and the average of 5 and 8 is 6.5. */

import java.util.Scanner;

public class strictAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double avg = (double) (a + b) / 2;
        if (avg > c) {
            System.out.println("YES. The average of " + a + " and " + b + "is strictly grater then " + c);
        } else {
            System.out.println("NO. The average of " + a + " and " + b + "is not strictly grater then " + c);
        }
        sc.close();
    }
}
