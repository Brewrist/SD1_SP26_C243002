/*In IIUC, there are X sections, and each section has Y students.
The semester-end results are in, and a total of Z students passed the exams.
Assuming that all students appeared for the exams, 
find whether the number of students who passed was strictly greater than 50%.*/

import java.util.Scanner;

public class passed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sections: ");
        int x = sc.nextInt();
        System.out.print("Students per section: ");
        int y = sc.nextInt();
        System.out.print("Students passed: ");
        int z = sc.nextInt();

        int total = x * y;

        if (z > total / 2)
            System.out.println("The number of students who passed was strictly greater than 50%");
        else
            System.out.println("The number of students who passed was not greater than 50%");

        sc.close();
    }
}