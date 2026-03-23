/*There are N children, and an IIUCian wants to give each of them 1 candy. He already has
X candies. To buy the rest, he visits a candy shop. In the shop, packets containing exactly
4 candies are available.
Determine the minimum number of candy packets he must buy so that he can give 1
candy packet to each of the N children. */

import java.util.Scanner;

public class candy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Childers: ");
        int n = sc.nextInt();
        System.out.print("Number of avaliable candies: ");
        int c = sc.nextInt();
        n -= (c / 4);
        System.out.println("He must buy "+ n +" candy packets.");
        sc.close();
    }
}
