package Array_2D.Assignments;

import java.util.Scanner;

public class WaveLike {
    public static void printLikeWave(int arr[][], int n, int m) {

        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            printLikeWave(arr, n, m);

            tests--;
        }

        sc.close();
    }
}
