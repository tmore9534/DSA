package Assignments;

import java.util.*;

public class CheckPermutation {

    public static boolean checkPermutation(String str1, String str2) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch));
            } else {
                hm.put(ch, 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (!hm.containsKey(ch) && !(hm.get(ch) > 0)) {
                return false;
            }

            hm.put(ch, hm.get(ch) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            System.out.println(checkPermutation(str1, str2));
            tests--;
        }
        sc.close();
    }
}
