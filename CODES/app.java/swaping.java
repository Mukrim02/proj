public class swaping {
    public static void main(String[] args) {
        int a = 10, b = 30;
        System.out.println("before Swaping=" + a);
        System.out.println("before Swaping=" + b);
        /*
         * int t = a;
         * a = b;
         * b = t;
         * System.out.println("after swaping=" + a);
         * System.out.println("after swaping=" + b);
         */
        /* without a third variabl */
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swaping a=" + a);
        System.out.println("after swaping b=" + b);

    }
}