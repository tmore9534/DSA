package Recursion_2;

import java.util.*;

public class Quick_Sort {

    public static int partition(int arr[], int start, int end) {
        // set pivot position
        int pivot = arr[start];

        // place pivot to the correct position - the key of the algorithm
        int count = 0;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }
        int pivotPosition = start + count;
        int temp = arr[start];
        arr[start] = arr[pivotPosition];
        arr[pivotPosition] = temp;

        // adjust elements as per pivotPosition

        int i = start;
        int j = end;

        while (i < j) {
            if (arr[i] <= pivot) {
                i++;
            } else if (arr[j] > pivot) {
                j--;
            } else {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return pivotPosition;

    }

    public static void quickSortHelper(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int pivotPosition = partition(arr, start, end);
        quickSortHelper(arr, start, pivotPosition - 1);
        quickSortHelper(arr, pivotPosition + 1, end);

    }

    public static void quickSort(int arr[]) {
        quickSortHelper(arr, 0, arr.length - 1);
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

            quickSort(arr);
            System.out.println(Arrays.toString(arr));
            tests--;
        }
        sc.close();
    }
}
