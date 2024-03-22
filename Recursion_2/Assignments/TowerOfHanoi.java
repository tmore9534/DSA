package Recursion_2.Assignments;

import java.util.*;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, source, auxiliary, destination);
        System.out.println(source + " " + destination);
        towerOfHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n, 'a', 'b', 'c');
    }
}
