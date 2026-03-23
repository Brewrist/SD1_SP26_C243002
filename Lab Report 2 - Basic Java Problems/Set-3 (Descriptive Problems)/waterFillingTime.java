/*An IIUCian has three water bottles. At any point, if at least two of them are empty, he
will fill them up. But if at most one bottle is empty, he will wait and not fill them up now.
You are given three integers: B1, B2, and B3. If B1=1, then the first bottle is full. If
B1=0, then the first bottle is empty. Similarly, B2 denotes whether the second bottle is

full or empty, and B3 denotes it for the third bottle. Output "Water filling time", if he has
to fill the bottles now. If not, output "Not now". */

import java.util.Scanner;

public class waterFillingTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 or 1");
        System.out.print("Bottle 1: ");
        int b1 = sc.nextInt();
        System.out.print("Bottle 2: ");
        int b2 = sc.nextInt();
        System.out.print("Bottle 3: ");
        int b3 = sc.nextInt();
        if (b1 + b2 + b3 <= 1) {
            System.out.println("Water filling time");
        }
        else {
            System.out.println("Not now");
        }
        sc.close();
    }
}
