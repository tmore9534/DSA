package Recursion_2.Assignments;

import java.util.Scanner;

public class StringInteger {
    public static int convertToInt(String str) {
        if (str.length() == 1) {
            return str.charAt(0) - '0';
        }

        int smallans = convertToInt(str.substring(1));
        int current_no = str.charAt(0) - '0';

        return (int) (current_no * Math.pow(10, str.length() - 1) + smallans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            String str = sc.next();
            System.out.println(convertToInt(str));
            tests--;
        }
        sc.close();
    }
}
