// we have several ways to find out duplicate elements from the array where some methods are applicable if the array
// only contains the 1 to N-1 elements i.e natural elements
// Naive approach - compare i the element with the j th element - O(n2)
// better approach - sort the array and run one loop and compare i th element with i+1 th element - O(nlogn)
// Optimized - use hashset and try to add all element, compare each time before adding - O(n) space - O(n)

// Dont use for this prb - (not applicable for 0 to N-2, only for 1 to N-1) Super Optimized (second approach) - As there are only positive numbers, so visit the index equal to the current element and make it negative. 
//   - If an index value is already negative, then it means that current element is repeated O(n), space - O(1)

// Implementing the HashSet Approach
package Assignments;

import java.util.*;

public class FindDuplicate {

    public static int findDuplicate(int arr[]) {

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (hashSet.contains(arr[i])) {
                return arr[i];
            }

            hashSet.add(arr[i]);
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
            System.out.println(findDuplicate(arr));

            tests--;
        }
        sc.close();
    }
}
