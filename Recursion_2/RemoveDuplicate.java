package Recursion_2;

import java.util.Scanner;

public class RemoveDuplicate {
    public static String removeDuplicates(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String ans = "";

        if (str.charAt(0) != str.charAt(1)) {
            ans += str.charAt(0);
        }

        return ans + removeDuplicates(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            String str = sc.next();
            System.out.println(removeDuplicates(str));
            tests--;
        }
        sc.close();
    }
}
