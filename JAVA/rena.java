import java.util.Scanner;

public class rena {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("your name");

                String name = scanner.nextLine();

                System.out.println("what is your rating");

                int rating = scanner.nextInt();
                System.out.println("hello" + name);
                System.out.println("your rated as" + rating);

        }
}
