package Recursion_1.Assignments;

import java.util.Scanner;

public class RecursiveMultiplication {

    private static int findMultiplication(int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        return 5 + findMultiplication(n, m - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(findMultiplication(n, m));
            tests--;
        }
        sc.close();
    }
}
