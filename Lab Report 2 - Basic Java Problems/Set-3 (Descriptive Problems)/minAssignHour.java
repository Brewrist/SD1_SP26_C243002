/*A student has to submit 3 assignments before 10 pm, and he starts to do the assignments
at X pm. Each assignment takes him 1 hour to complete. Can you tell whether he'll be
able to complete all assignments on time? */

import java.util.Scanner;

public class minAssignHour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(10-a>=3)
            System.out.println("The student can complete the assignments.");
        else
            System.out.println("The student can not complete the assignments.");
        sc.close();
    }
}
