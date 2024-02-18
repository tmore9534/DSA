import java.util.Scanner;

public class CheckPalindrome {

    public static boolean checkPalindrome(String str) {
        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
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
