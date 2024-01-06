import java.util.*;

public class BinaryToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        long res = 0;
        int i = 0;
        while (no > 0) {
            int r = no % 10;
            if (r == 1) {
                res += Math.pow(2, i);
            }
            i++;
            no = no / 10;
        }
        System.out.println(res);
        sc.close();
    }
}
