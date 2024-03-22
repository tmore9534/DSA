package Recursion_1;

import java.util.*;

public class CalculatePower {

    public static int powerOfN(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * powerOfN(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int x = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(powerOfN(x, n));
            tests--;
        }
        sc.close();
    }

}
