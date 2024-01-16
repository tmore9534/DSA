import java.util.Scanner;

public class FarhenheitToCelsius {

    public static int farenhitToCelsius(int farenhit) {
        int celsius = ((farenhit - 32) * 5) / 9;
        return celsius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int w = sc.nextInt();

            for (int i = s; i <= e; i += w) {
                int celsius = farenhitToCelsius(i);
                System.out.println(i + "\t" + celsius);
            }
            tests--;
        }
        sc.close();
    }
}
