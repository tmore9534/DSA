package Array_2D;

import java.util.Scanner;

public class LargestRowColumn {
    public static void getLargest(int arr[][], int n, int m) {
        int largest = Integer.MIN_VALUE;
        boolean isCol = false;
        int num = 0;

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < m; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum > largest) {
                largest = rowSum;
                num = i;
            }
        }

        for (int i = 0; i < m; i++) {
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                colSum += arr[j][i];
            }
            if (colSum > largest) {
                largest = colSum;
                num = i;
                isCol = true;
            }
        }

        if (isCol) {
            System.out.println("Column " + num + " " + largest);
        } else {
            System.out.println("row " + num + " " + largest);

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

            getLargest(arr, n, m);

            tests--;
        }
    }
}
