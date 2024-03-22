package Recursion_2;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    public static void merge(int arr[], int start, int end) {
        int size = end - start + 1;
        int ans[] = new int[size];
        int mid = (start + end) / 2;

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                k++;
                i++;
            } else {
                ans[k] = arr[j];
                k++;
                j++;
            }
        }

        while (i <= mid) {
            ans[k] = arr[i];
            k++;
            i++;
        }

        while (j <= end) {
            ans[k] = arr[j];
            k++;
            j++;
        }
        int m = 0;
        for (i = start; i <= end; i++) {
            arr[i] = ans[m];
            m++;
        }

    }

    public static void mergeSortHelper(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSortHelper(arr, start, mid);
        mergeSortHelper(arr, mid + 1, end);
        merge(arr, start, end);

    }

    public static void mergeSort(int arr[]) {
        mergeSortHelper(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int no = sc.nextInt();
            int arr[] = new int[no];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            mergeSort(arr);
            System.out.println(Arrays.toString(arr));

            tests--;
        }
        sc.close();
    }
}
