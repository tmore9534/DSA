package Time_Complexity;

import java.util.*;

public class ArrayIntersection {
    public static void intersectionOfArrays(int arr1[], int arr2[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if (hm.containsKey(arr1[i])) {
                hm.put(arr1[i], hm.get(arr1[i]) + 1);
            } else {
                hm.put(arr1[i], 1);
            }
        }

        for (int j = 0; j < arr2.length; j++) {
            if (hm.containsKey(arr2[j]) && hm.get(arr2[j]) >= 1) {
                System.out.print(arr2[j] + " ");
                hm.put(arr2[j], hm.get(arr2[j]) - 1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int n = sc.nextInt();
            int arr1[] = new int[n];

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
            }

            int m = sc.nextInt();
            int arr2[] = new int[m];

            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = sc.nextInt();
            }

            intersectionOfArrays(arr1, arr2);
            tests--;
        }
        sc.close();
    }
}
