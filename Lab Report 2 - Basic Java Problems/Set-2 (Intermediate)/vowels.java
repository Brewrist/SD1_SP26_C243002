import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                v++;
            }
            else if(s.charAt(i)!=' '){
                c++;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonent: " + c);
        sc.close();
    }
}
