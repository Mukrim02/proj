import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner BM = new Scanner(System.in);
        int n = BM.nextInt();
        for (int i = 0; i <= n; ++i) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }
}