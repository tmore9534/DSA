import java.util.Scanner;

public class AllSubStr {

    public static void findAllSubstr(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.println(str.substring(i, j + 1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            String str = sc.next();
            findAllSubstr(str);
            tests--;
        }
        sc.close();
    }
}
