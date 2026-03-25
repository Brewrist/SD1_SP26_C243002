// Find the largest number in an array

import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxVal = 0;
        for (int i = 0; i < n; i++) {
            maxVal = Math.max(maxVal,arr[i]);
        }
        System.out.println(maxVal);
        sc.close();
    }
}
