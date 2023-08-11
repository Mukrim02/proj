import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        Set<Integer> distinctElements = new HashSet<>();
        for (int i = 0; i < size; i++) {
            distinctElements.add(arr[i]);
        }
        for (int element : arr) {
            if (distinctElements.contains(element)) {
                System.out.println(element);
                distinctElements.remove(element);
            }
        }

    }
}