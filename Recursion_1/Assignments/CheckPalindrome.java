package Recursion_1.Assignments;

import java.util.Scanner;

public class CheckPalindrome {
    private static boolean checkPalindromHelper(String str, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return true;
        }
        if (str.charAt(startIndex) != str.charAt(endIndex)) {
            return false;
        }

        return checkPalindromHelper(str, startIndex + 1, endIndex - 1);
    }

    public static boolean checkPalindrome(String str) {
        return checkPalindromHelper(str, 0, str.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            String str = sc.next();
            System.out.println(checkPalindrome(str));
            tests--;
        }
        sc.close();
    }
}
