
// result may contain more digits, use long to store the number
import java.util.*;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        long res = 0;
        while (no > 0) {
            int r = no % 10;
            res = res * 10 + r;
            no = no / 10;
        }
        System.out.println(res);
        sc.close();
    }
}
