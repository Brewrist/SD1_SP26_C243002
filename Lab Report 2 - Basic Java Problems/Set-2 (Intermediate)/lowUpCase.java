import java.util.Scanner;

public class lowUpCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);
        sc.close();
    }
}
