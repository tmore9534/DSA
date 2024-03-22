package Recursion_1;

import java.util.Scanner;

public class NumOfDigit {
    public static int getTotalNoDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return 1 + getTotalNoDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int n = sc.nextInt();
            System.out.println(getTotalNoDigits(n));
            tests--;
        }
        sc.close();
    }
}
