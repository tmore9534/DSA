package Recursion_1;

import java.util.Arrays;
import java.util.Scanner;

public class AllIndices {
    private static int[] getAllIndicesHelper(int arr[], int x, int startIndex, int ans[]) {
        if (startIndex == arr.length) {
            return new int[0];
        }

        ans = getAllIndicesHelper(arr, x, startIndex + 1, ans);
        if (arr[startIndex] == x) {
            int newAns[] = new int[ans.length + 1];
            newAns[0] = startIndex;
            for (int i = 0; i < ans.length; i++) {
                newAns[i + 1] = ans[i];
            }
            return newAns;
        } else {
            return ans;
        }
    }

    private static int[] getAllIndices(int arr[], int x, int ans[]) {
        return getAllIndicesHelper(arr, x, 0, ans);
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
            int result[] = getAllIndices(arr, x, new int[0]);
            System.out.println("All indices: " + Arrays.toString(result));
            tests--;
        }
        sc.close();
    }
}
