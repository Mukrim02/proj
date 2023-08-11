import java.io.*;
import java.util.*;

public class Solution1{

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 0;
        int c = (n * n) + 1;
        for (int i = n; i >= 1; i--) {
            for (int j = b; j >= 1; j--) {
                System.out.print("-");
            }
            for (int k = 1; k <= i; k++) {
                if (k == i) {
                    System.out.print((a++));
                } else {
                    System.out.print((a++) + "*");
                }
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*" + (c++));
            }

            System.out.println();
            b += 2;
            c = (c - 1) - ((i - 1) * 2);
        }
    }
}