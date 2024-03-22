package Recursion_2;

import java.util.Scanner;

public class RemoveX {
    public static String removeX(String str) {
        if (str.length() == 0) {
            return str;
        }
        String ans = removeX(str.substring(1));
        if (str.charAt(0) != 'x') {
            ans = str.charAt(0) + ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            String str = sc.next();
            System.out.println(removeX(str));
            tests--;
        }
        sc.close();
    }
}
