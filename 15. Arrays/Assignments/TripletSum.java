package Assignments;

import java.util.*;

public class TripletSum {

    public static int findTripletSum(int arr[], int k) {
        int cnt = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int curr_sum = k - arr[i];
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int j = i + 1; j < arr.length; j++) {
                if (hashMap.containsKey(curr_sum - arr[j])) {
                    cnt += hashMap.get(curr_sum - arr[j]);
                }
                if (hashMap.containsKey(arr[j])) {
                    hashMap.put(arr[j], hashMap.get(arr[j] + 1));
                } else {
                    hashMap.put(arr[j], 1);
                }
            }
        }

        return cnt;
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
            System.out.println(findTripletSum(arr, k));
            tests--;
        }
        sc.close();
    }
}
