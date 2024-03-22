package Recursion_2.Assignments;

import java.util.Scanner;

public class PairStar {
    public static String insertStar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String ans = "";
        if (str.charAt(0) == str.charAt(1)) {
            ans = str.charAt(0) + "*";
        } else {
            ans = str.charAt(0) + "";
        }

        return ans + insertStar(str.substring(1));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            String str = sc.next();
            System.out.println(insertStar(str));
            tests--;
        }
        sc.close();
    }
}
