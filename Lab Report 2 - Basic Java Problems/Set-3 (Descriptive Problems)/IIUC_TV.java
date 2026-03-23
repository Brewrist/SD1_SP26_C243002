/*A new TV streaming service, IIUC-TV, was recently launched in IIUC Hall. A group of
N friends in IIUC wants to buy IIUC-TV subscriptions. We know that 6 people can share
a single IIUC-TV subscription, IIUC. Also, the cost of one IIUC-TV subscription is X
Taka. Determine the minimum total cost that the group of N friends will incur to use
IIUC-TV, IIUC. */

import java.util.Scanner;

public class IIUC_TV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        System.out.println("Minimum cost for using IIUC-TV is "+a/6+" per person");
        sc.close();
    }
}
