// Check if a string is a palindrome

import java.util.Scanner;

public class palindromeStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                System.out.println("Not Palindrome");
                sc.close();
                return;
            }
        }
        System.out.println("Is Palindrome");
        sc.close();
    }
}
