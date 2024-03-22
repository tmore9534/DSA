import java.util.*;

public class MinimumString {

    public static String findMinimumString(String str) {
        int current_start = 0;
        int i = 0;
        String minString = "";

        while (i <= str.length()) {

            if (i == str.length() || str.charAt(i) == ' ') {
                String ans = str.substring(current_start, i);

                if (ans.length() < minString.length() || i == str.length()) {
                    minString = ans;
                }
                current_start = i + 1;
            }
            i++;
        }

        return minString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        sc.nextLine(); // consuming the '\n' not used by nextInt()
        while (tests > 0) {
            String str = sc.nextLine();
            System.out.println(findMinimumString(str));
            tests--;
        }
        sc.close();
    }
}
