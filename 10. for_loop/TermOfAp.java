import java.util.*;

public class TermOfAp {
    public static void main(String[] args) {
        // 3N+2

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        int count = 1;
        int i = 1;
        while (count <= no) {

            if ((3 * i + 2) % 4 != 0) {
                System.out.print((3 * i + 2) + " ");
                count += 1;
            }

            i = i + 1;
        }
        sc.close();
    }

}
