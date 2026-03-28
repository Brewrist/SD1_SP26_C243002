/*Capitalization is writing a word with its first letter as a capital letter. Your task is to
capitalize the given word.
Note that during capitalization, all the letters except the first one remains unchanged.*/

import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = Character.toUpperCase(s.charAt(0));
        s = c + s.substring(1);
        System.out.println(s);

        sc.close();
    }
}
