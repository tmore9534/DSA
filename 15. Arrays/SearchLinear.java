import java.util.Scanner;

public class SearchLinear {

    public static void search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int no = sc.nextInt();
            int arr[] = new int[no];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            search(arr, x);
            tests--;
        }
        sc.close();
    }
}
