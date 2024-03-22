// dont think much on how it will solve the rest of the problem, just think around small problem and base case.
package Recursion_1;

import java.util.Scanner;

public class LastIndex {
    private static int lastIndexOfHelper(int arr[], int x, int startIndex) {
        if (startIndex == arr.length) {
            return -1;
        }

        int smallAns = lastIndexOfHelper(arr, x, startIndex + 1);
        if (smallAns != -1) {
            return smallAns;
        }
        if (arr[startIndex] == x) {
            return startIndex;
        } else {
            return -1;
        }
    }

    private static int lastIndexOf(int arr[], int x) {
        return lastIndexOfHelper(arr, x, 0);
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
            System.out.println(lastIndexOf(arr, x));
            tests--;
        }
        sc.close();
    }
}
