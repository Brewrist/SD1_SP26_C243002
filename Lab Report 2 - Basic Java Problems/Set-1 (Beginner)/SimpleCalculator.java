// Simple Calculator (Add, Subtract, Multiply, Divide): Use if-else or switch to perform operations.

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter Operation (+, -, *, /): ");
        char c = sc.next().charAt(0);

        System.out.print("Enter another number: ");
        int m = sc.nextInt();

        if (c == '+') {
            System.out.print("Addition: " + (n + m));
        }
        else if (c == '-') {
            System.out.print("Subtraction: " + (n - m));
        }
        if (c == '*') {
            System.out.print("Multiplication: " + (n * m));
        }
        if (c == '/') {
            if (m != 0) {
                System.out.print("Divition: " + (n / m));
            }
            else {
                System.out.println("Error");
            }
        }
        sc.close();
    }
}
