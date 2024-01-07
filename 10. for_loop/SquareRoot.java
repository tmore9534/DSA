import java.util.*;

public class SquareRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        int i = 1;
        while (i * i <= no) {
            i++;
        }

        System.out.println(i - 1);
        sc.close();
    }
}
