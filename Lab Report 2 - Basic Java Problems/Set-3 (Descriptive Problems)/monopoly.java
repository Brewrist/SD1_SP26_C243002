/*There are 4 companies in the markets of Chittagong, A, B, C, and D. This year,
a. Company A made a profit of P lakh,
b. Company B made a profit of Q lakh,
c. Company C made a profit of R lakh,
d. Company D made a profit of S lakh.
There is said to be a monopoly in the market if the profit made by one company is strictly
greater than the sum of profits made by all other companies. Determine whether there is a
monopoly in the market.*/

import java.util.Scanner;

public class monopoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Company A made a profit of: ");
        int a = sc.nextInt();
        System.out.print("Company B made a profit of: ");
        int b = sc.nextInt();
        System.out.print("Company C made a profit of: ");
        int c = sc.nextInt();
        System.out.print("Company D made a profit of: ");
        int d = sc.nextInt();
        int sum = a+b+c+d;
        if (sum - a < a || sum - b < b || sum - c < c || sum - d < d) {
            System.out.println("There is a monopoly in the market");
        }
        else {
            System.out.println("There is no monopoly in the market");
        }
        sc.close();
    }
}
