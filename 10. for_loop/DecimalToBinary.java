import java.util.*;

public class DecimalToBinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        long res = 0;
        int pval = 1;
        while (no > 0) {
            int lastdigit = no % 2;
            res += lastdigit * pval;
            pval *= 10;
            no = no / 2;
        }
        System.out.println(res);
        sc.close();
    }
}
