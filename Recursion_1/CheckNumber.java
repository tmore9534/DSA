// try to use the helper function to maintain the abstraction
package Recursion_1;

import java.util.Scanner;

public class CheckNumber {
    private static boolean isPresentHelper(int arr[], int x, int startIndex) {
        if (startIndex == arr.length) {
            return false;
        }

        boolean smallAns = isPresentHelper(arr, x, startIndex + 1);
        if (smallAns) {
            return true;
        }
        return arr[startIndex] == x;
    }

    private static boolean isPresent(int arr[], int x) {
        return isPresentHelper(arr, x, 0);
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
            int x = sc.nextInt();
            System.out.println(isPresent(arr, x));
            tests--;
        }
        sc.close();
    }
}
