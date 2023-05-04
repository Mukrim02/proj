import java.util.Scanner;

public class reversae {
    public static void main(String[] args) {
        var bm = new Scanner(System.in);
        String oc = bm.nextLine();
        String sr = " ";
        int s = 0;
        String str = oc + sr;
        int len = str.length();
        int n = 0;
        ;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ') {
                n++;
            } else {
                for (int j = n; j > s; j--)
                    System.out.println(str.charAt(j - 1));
            }
            System.out.print();
            n++;
            s = n;
        }

    }

}
