// Find the smallest number in an array

import java.util.Scanner;

public class smallestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minVal = Math.min(minVal,arr[i]);
        }
        System.out.println("Smallest Number: "+minVal);
        sc.close();
    }
}
