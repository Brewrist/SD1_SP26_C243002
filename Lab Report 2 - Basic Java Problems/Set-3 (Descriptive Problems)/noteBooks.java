/*You know that 1 kg of pulp can be used to make 1000 pages and 1 notebook consists of
100 pages. Suppose a notebook factory receives N kg of pulp. How many notebooks can
be made from that? */

import java.util.Scanner;

public class noteBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pulp received(KG): ");
        int n = sc.nextInt();

        System.out.println((n*1000)/100+" NoteBooks can be made.");
        sc.close();
    }
}
