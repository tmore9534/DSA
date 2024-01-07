import java.util.*;

public class SequenceNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int arr[] = new int[no];

        for (int i = 0; i < no; i++) {
            arr[i] = sc.nextInt();
        }

        int prev = arr[0];
        int i = 1;
        boolean isDec = true;
        while (i < no) {
            int curr = arr[i];
            if (prev == curr) {
                System.out.println("false");
                return;
            }
            if (prev > curr) {
                if (isDec == false) {
                    System.out.println("false");
                    return;
                }
            } else {
                isDec = false;
            }
            prev = curr;
            i++;
        }
        System.out.println("true");
        sc.close();

    }

}
