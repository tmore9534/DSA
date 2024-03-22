package Recursion_1;

import java.util.Scanner;

public class SumAllArray {
    public static int sumElements(int arr[]) {
        if (arr.length == 1) {
            return arr[0];
        }
        int input[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            input[i - 1] = arr[i];
        }
        return arr[0] + sumElements(input);
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
            System.out.println(sumElements(arr));
            tests--;
        }
        sc.close();
    }
}
