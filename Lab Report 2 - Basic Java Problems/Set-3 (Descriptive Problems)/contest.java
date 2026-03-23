/*An IIUCian has reached the finals of the Annual Inter-university Declamation contest.
For the finals, students were asked to prepare 10 topics. However, he was only able to
prepare three topics, numbered A, B, and C; he is totally blank about the other topics.
This means he can only win the contest if he gets to speak on topics A, B, or C. On the
contest day, he gets topic X.
Determine whether he has any chances of winning the competition. Print "Yes" if it is
possible to win the contest, else print "No".*/

import java.util.Scanner;

public class contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("On the contest day, the topic he got is (A,B,C, . . . ,X,Y,Z): ");
        char s = sc.next().charAt(0);
        if (s == 'A' || s == 'B' || s == 'C') {
            System.out.print("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
