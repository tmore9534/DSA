package Array_2D.Assignments;

import java.util.Scanner;

public class DiagonalCornerSum {
    public static int getFirstDiagonalSum(int arr[][], int n) {
        int sum = 0;
        int i = 0;
        int j = 0;

        while (i < n && j < n) {
            sum += arr[i][j];
            i += 1;
            j += 1;
        }

        return sum;
    }

    public static int getSecondDiagonalSum(int arr[][], int n) {
        int sum = 0;
        int i = 0;
        int j = n - 1;

        while (i < n && j < n) {
            sum += arr[i][j];
            i += 1;
            j -= 1;
        }

        return sum;
    }

    public static int getBoundrySum(int arr[][], int n) {
        int sum = 0;
        for (int i = 1; i < n - 1; i++) {
            sum += arr[0][i];
            sum += arr[i][0];
            sum += arr[i][n - 1];
            sum += arr[n - 1][i];

        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int n = sc.nextInt();
            int arr[][] = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int sum = getFirstDiagonalSum(arr, n) + getSecondDiagonalSum(arr, n) + getBoundrySum(arr, n);
            // if n is odd means, since it calculates diagonal middle twice, so reduce once
            if (n % 2 != 0) {
                sum -= arr[n / 2][n / 2];
            }
            System.out.println(sum);
            tests--;
        }
    }
}
