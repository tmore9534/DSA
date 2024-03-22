package Recursion_1.Assignments;

import java.util.Scanner;

public class SumDigits {
    private static int getSum(int n) {
        if (n == 0) {
            return 0;
        }

        return getSum(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int n = sc.nextInt();
            System.out.println(getSum(n));
            tests--;
        }
        sc.close();
    }
}
