package Recursion_1.Assignments;

import java.util.Scanner;

public class CountZeros {
    private static int getZerosCount(int n) {
        if (n < 10) {
            if (n == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        int count = getZerosCount(n / 10);
        if (n % 10 == 0) {
            return count + 1;
        } else {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int n = sc.nextInt();
            System.out.println(getZerosCount(n));
            tests--;
        }
        sc.close();
    }
}
