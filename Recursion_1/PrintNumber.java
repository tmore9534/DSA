package Recursion_1;

import java.util.Scanner;

public class PrintNumber {
    public static void printNumbers(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        printNumbers(n - 1);
        System.out.print(" " + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int n = sc.nextInt();
            printNumbers(n);
            tests--;
        }
        sc.close();
    }
}
