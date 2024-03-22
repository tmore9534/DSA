package Recursion_2;

import java.util.Scanner;

public class ReplaceCharacters {

    public static String replaceCharacter(String str, char toReplace, char withReplace) {
        if (str.length() == 0) {
            return str;
        }
        String ans = "";
        if (str.charAt(0) == toReplace) {
            ans += withReplace;
        } else {
            ans += str.charAt(0);
        }
        return ans + replaceCharacter(str.substring(1), toReplace, withReplace);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            String str = sc.next();
            char a = sc.next().charAt(0);
            char b = sc.next().charAt(0);
            System.out.println(replaceCharacter(str, a, b));
            tests--;
        }
        sc.close();
    }
}
