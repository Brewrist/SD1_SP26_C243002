/*There are three people sitting in a room: Dean Sir, Chairman Sir, and Coordinator Sir.
They need to decide on the temperature to set on the air conditioner. Everyone has a
demand each:
a. Alice wants the temperature to be at least A degrees.
b. Bob wants the temperature to be at most B degrees.
c. Charlie wants the temperature to be at least C degrees.
Can they all agree on some temperature, or not?.*/

import java.util.Scanner;

public class tempreture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Alice wants the temperature to be at least: ");
        int a = sc.nextInt();
        System.out.print("Bob wants the temperature to be at most: ");
        int b = sc.nextInt();
        System.out.print("Charlie wants the temperature to be at least: ");
        int c = sc.nextInt();
        if (a == c && a <= b) {
            System.out.println("They all can agree on some temperature");
        }
        else if (a!=c) {
            System.out.println("They cannot agree on some temperature");
        }
        else {
            System.out.println("They cannot agree on some temperature");
        }
        sc.close();
    }
}
