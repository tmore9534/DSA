package Recursion_2.Assignments;

import java.util.Scanner;

public class ReplacePi {
    public static String removePI(String str) {
        if (str.length() <= 1) {
            return str;
        }

        if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
            String ans = "3.14";
            return ans + removePI(str.substring(2));
        } else {
            String ans = str.charAt(0) + "";
            return ans + removePI(str.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            String str = sc.next();
            System.out.println(removePI(str));
            tests--;
        }
        sc.close();
    }
}
