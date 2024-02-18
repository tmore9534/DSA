package Assignments;

import java.util.Scanner;

public class FindUnique {

    public static int findUnique(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        break;
                    }
                }
            }

            if (j == arr.length) {
                return arr[i];
            }

        }
        return Integer.MIN_VALUE;
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
            System.out.println(findUnique(arr));

            tests--;
        }
        sc.close();
    }
}
