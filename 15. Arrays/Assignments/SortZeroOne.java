package Assignments;

import java.util.*;

public class SortZeroOne {

    public static void sortZeroOne(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] == 0) {
                start++;
            } else if (arr[end] == 1) {
                end--;
            } else {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
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
            sortZeroOne(arr);
            System.out.println(Arrays.toString(arr));
            tests--;
        }
        sc.close();
    }
}
