// First way 
// import java.util.*;

// public class SwapAlternate {

//     public static void swapElements(int arr[]) {
//         for (int j = 0, i = 1; i <= arr.length - 1; i += 2, j += 2) {
//             int temp = arr[j];
//             arr[j] = arr[i];
//             arr[i] = temp;
//             System.out.print("temp" + temp);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int tests = sc.nextInt();

//         while (tests > 0) {
//             int no = sc.nextInt();
//             int arr[] = new int[no];

//             for (int i = 0; i < arr.length; i++) {
//                 arr[i] = sc.nextInt();
//             }

//             swapElements(arr);

//             System.out.println(Arrays.toString(arr));
//             tests--;
//         }
//         sc.close();
//     }
// }

// Second way

import java.util.*;

public class SwapAlternate {

    public static void swapElements(int arr[]) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
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

            swapElements(arr);

            System.out.println(Arrays.toString(arr));
            tests--;
        }
        sc.close();
    }
}
