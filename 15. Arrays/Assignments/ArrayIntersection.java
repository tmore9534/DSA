// First approach - naive with the two loops and check each element and mark visited/checked as Integer MIN_Value - O(n2)
// similiar problem without duplicate link - https://www.geeksforgeeks.org/find-union-and-intersection-of-two-unsorted-arrays/
// note: most of the approaches like hashset are not applicable here because they doesnot work for duplicate element here

package Assignments;

import java.util.*;

public class ArrayIntersection {

    public static void arrayIntersection(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int N1 = sc.nextInt();
            int arr1[] = new int[N1];

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
            }

            int N2 = sc.nextInt();
            int arr2[] = new int[N2];

            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = sc.nextInt();
            }

            arrayIntersection(arr1, arr2);
            tests--;
        }
        sc.close();
    }
}
