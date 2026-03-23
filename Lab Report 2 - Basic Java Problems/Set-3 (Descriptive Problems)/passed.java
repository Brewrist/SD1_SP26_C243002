/*Recently You joined a new company. At this company, employees must work X hours
each day from Saturday to Wednesday. Also, in this company, Wednesday is called Chill
Day; employees only have to work for Y hours (Y<X) on Wednesday.
Determine the total number of working hours in one week. */

import java.util.Scanner;

public class passed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Usual working hours: ");
        int x = sc.nextInt();
        System.out.print("Working hours on Wednesday: ");
        int y = sc.nextInt();

        System.out.println("Working hours per week is "+((x*4)+y));
        sc.close();
    }
}
