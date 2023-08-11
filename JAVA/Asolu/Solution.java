import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int counter = 1;

        while (s.hasNextLine()) {
            String line = s.nextLine();

            System.out.println(counter + " " + line);
            counter++;
        }
    }
}