package Arrays2;

import java.util.Scanner;

public class InsertionSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > element; j--) {
                // if (arr[j] <= element) { // use equal to make insertion sort as stable as we
                // insert the equal element
                // // right side in sorted array.
                // break;
                // }
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = element;
        }
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
            insertionSort(arr);
            printArray(arr);
            tests--;
        }
        sc.close();
    }
}
