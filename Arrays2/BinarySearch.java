package Arrays2;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int arr[], int x) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < x) {
                start = mid + 1;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
        int arr[] = new int[no];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int tests = sc.nextInt();
        while (tests > 0) {
            int x = sc.nextInt();
            System.out.println(binarySearch(arr, x));
            tests--;
        }
        sc.close();
    }
}
