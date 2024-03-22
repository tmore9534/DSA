// geometric some  1+1/2^1+1/2^2+1/2^3..........1/2^k
package Recursion_1.Assignments;

import java.util.Scanner;

public class GeometricSum {
    private static double getGeoSum(int k) {
        if (k == 0) {
            return 1;
        }
        return getGeoSum(k - 1) + 1 / Math.pow(2, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int k = sc.nextInt();
            System.out.println(getGeoSum(k));
            tests--;
        }
        sc.close();
    }
}
