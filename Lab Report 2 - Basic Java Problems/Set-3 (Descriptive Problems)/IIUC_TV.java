/*A new TV streaming service, IIUC-TV, was recently launched in IIUC Hall. A group of
N friends in IIUC wants to buy IIUC-TV subscriptions. We know that 6 people can share
a single IIUC-TV subscription, IIUC. Also, the cost of one IIUC-TV subscription is X
Taka. Determine the minimum total cost that the group of N friends will incur to use
IIUC-TV, IIUC. */

import java.util.Scanner;

public class IIUC_TV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of people: ");
        double n = sc.nextInt();
        System.out.print("Cost of one subscription: ");

        double x = sc.nextInt();
        double sub = (n + 5) / 6;
        double totalCost = sub * x;
        System.out.println("Minimum subscriptions needed: ");
        System.out.println(totalCost);
        sc.close();
    }
}
