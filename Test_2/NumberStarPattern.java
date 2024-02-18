package Test_2;

import java.util.*;

public class NumberStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        for (int i = 1; i <= no; i++) {
            // IncreasingNumbers
            for (int j = 1; j <= no - i + 1; j++) {
                System.out.print(j);
            }

            // stars
            for (int stars = 1; stars <= (i - 1) * 2; stars++) {
                System.out.print("*");
            }

            // DecreasingNumbers
            for (int j = no - i + 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();

        }

    }
}
