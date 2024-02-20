package Arrays2;

import java.util.Scanner;

public class MergeSortedArrays {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSorted(int arr1[], int arr2[], int ans[]) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int n = sc.nextInt();
            int arr1[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }

            int m = sc.nextInt();
            int arr2[] = new int[m];

            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }
            int ans[] = new int[m + n];
            mergeSorted(arr1, arr2, ans);
            printArray(ans);
            tests--;
        }
        sc.close();
    }
}
