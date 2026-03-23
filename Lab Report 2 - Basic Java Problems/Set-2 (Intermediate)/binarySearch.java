import java.util.Scanner;
import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("What element do you want to search for?: ");
        int num = sc.nextInt();

        int l = 0, r = n - 1, m = (l + r) / 2;;
        while (l <= r) {
            
            if (arr[m] < num) {
                l = m + 1;
                m = (l + r) / 2;
            }
            if (arr[m] > num) {
                r = m - 1;
                m = (l + r) / 2;
            }
            if (arr[m] == num) {
                System.out.println("Your element has been found = " + arr[m]);
                sc.close();
                return;
            }
        }
        System.out.println("Not found.");
        sc.close();
    }
}
//0 1 2 3 4 5 6 7 8 9
//1 2 3 4 5 6 7 8 9 10
//          l r