package Array_2D.Assignments;

import java.util.Scanner;

public class SpiralPrint {
    public static void spiralPrint(int arr[][], int n, int m) {
        if (n == 0) {
            return;
        }

        int totalElements = n * m;
        int currentElements = 0;
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;

        while (currentElements < totalElements) {

            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(arr[rowStart][i] + " ");
                currentElements++;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(arr[i][colEnd] + " ");
                currentElements++;
            }

            colEnd--;

            for (int i = colEnd; i >= colStart; i--) {
                System.out.print(arr[rowEnd][i] + " ");
                currentElements++;
            }

            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.print(arr[i][colStart] + " ");
                currentElements++;
            }

            colStart++;
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

            spiralPrint(arr, n, m);

            tests--;
        }

        sc.close();
    }
}
