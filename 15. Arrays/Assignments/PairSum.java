package Assignments;

import java.util.*;

public class PairSum {

    public static int findNoOfPairs(int arr[], int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (hashMap.containsKey(k - arr[i])) {
                count += hashMap.get(k - arr[i]);
            }

            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }

        }

        return count;
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

            int k = sc.nextInt();

            System.out.println(findNoOfPairs(arr, k));
            tests--;
        }
        sc.close();
    }
}
