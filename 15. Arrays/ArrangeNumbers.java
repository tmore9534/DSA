// First Approach fill first half of array with odd and then fill second off with even in separe loops,
// odd - for  i=0 to (N-1)/2; value start with 1 and add 2
// even - for i= ((N-1)/2)+1 to n-1; value start with n if N is even and n-1 if N is odd and keep substracting 2

// //First way for O(n)
// import java.util.*;

// public class ArrangeNumbers {
//     public static int[] arrange(int no) {
//         int[] arr = new int[no];
//         int rev = arr.length - 1;
//         int start = 0;
//         for (int i = 1; i <= no; i++) {
//             if (i % 2 == 0) {
//                 arr[rev] = i;
//                 rev--;
//             } else {
//                 arr[start] = i;
//                 start++;
//             }
//         }
//         return arr;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int tests = sc.nextInt();

//         while (tests > 0) {
//             int no = sc.nextInt();

//             int arr[] = arrange(no);
//             System.out.println(Arrays.toString(arr));
//             tests--;
//         }
//         sc.close();
//     }
// }

// second way
import java.util.*;

public class ArrangeNumbers {
    public static void arrange(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int counter = 1;
        while (start <= end) {
            if (counter % 2 != 0) {
                arr[start] = counter;
                start++;
            } else {
                arr[end] = counter;
                end--;
            }
            counter++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0) {
            int no = sc.nextInt();
            int[] arr = new int[no];
            arrange(arr);
            System.out.println(Arrays.toString(arr));
            tests--;
        }
        sc.close();
    }
}