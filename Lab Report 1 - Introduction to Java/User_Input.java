import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Your Input: " + n);
        sc.close();
    }
}