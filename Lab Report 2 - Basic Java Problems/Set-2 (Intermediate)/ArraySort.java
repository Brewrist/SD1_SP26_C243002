// Sort an array (Ascending Order)

import java.util.Scanner;

public class ArraySort { //Merge Sort - O(nlogn)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        //int[] arr = { 10, 9, 8, 6, 7, 1, 2, 4, 3, 5 };
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        mergeSort(arr);

        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }

        sc.close();
    }

    private static void mergeSort(int[] arr) {
        int len = arr.length;
        if (len <= 1)
            return;
        int m = len / 2;

        int[] leftArr = new int[m];
        int[] rightArr = new int[len - m];

        for (int i = 0, j = 0; i < len; i++) {
            if (i < m) {
                leftArr[i] = arr[i];
            } 
            else {
                rightArr[j] = arr[i];
                j++;
            }
        }
        
    mergeSort(leftArr);
    mergeSort(rightArr);
    merge(leftArr, rightArr, arr);
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int leftLen = arr.length / 2;
        int rightLen = arr.length - leftLen;
        int i = 0, l = 0, r = 0;
        while (l < leftLen && r < rightLen) {
            if (leftArr[l] < rightArr[r]) {
                arr[i] = leftArr[l];
                i++;
                l++;
            } 
            else {
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }
        while(l<leftLen){
            arr[i]=leftArr[l];i++;l++;
        }
        while(r<rightLen){
            arr[i]=rightArr[r];i++;r++;
        }
    }
}

