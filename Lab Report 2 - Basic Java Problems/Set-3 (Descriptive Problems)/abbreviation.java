/*Sometimes, some words like "localization" or "internationalization" are so long that
writing them many times in one text is quite tiresome.

Let's consider a word too long, if its length is strictly more than 10 characters. All too
long words should be replaced with a special abbreviation.
This abbreviation is made like this: we write the first and last letters of a word, and
between them we write the number of letters between them. That number is in decimal
and doesn't contain any leading zeros.
Thus, "localization" will be spelt as "l10n", and "internationalization” will be spelt as
"i18n".
You are suggested to automate the process of changing words with abbreviations. At that,
all too long words should be replaced by the abbreviation and the words that are not too
long should not undergo any changes. */

import java.util.Scanner;

public class abbreviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        if (n > 10) {
            System.out.print(s.charAt(0));
            System.out.print(n - 2);
            System.out.print(s.charAt(n - 1));
        }
        else {
            System.out.println(s);
        }
        sc.close();
    }
}
