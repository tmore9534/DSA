import java.util.Scanner;

public class FibonacciSeries {

    public static boolean checkFibonacciNumber(int no) {
        // special case
        if (no == 0) {
            return true;
        }
        int first = 0;
        int second = 1;
        int third = 1;
        while (third < no) {
            third = first + second;
            first = second;
            second = third;
        }
        if (third == no) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int no = sc.nextInt();
            System.out.println(checkFibonacciNumber(no));
            tests--;
        }
        sc.close();
    }
}
