import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public static String reverseStringWordWise(String input) {
        String[] str = input.split(" ");
        System.out.println(Arrays.toString(str));
        int n = str.length;
        for (int i = 0; i < n / 2; i++) {
            String temp = str[i];
            str[i] = str[n - 1 - i];
            str[n - 1 - i] = temp;
        }
        return String.join(" ", str);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);

    }
}
