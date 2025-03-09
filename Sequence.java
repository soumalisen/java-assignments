public class Sequence {
    public static void main(String[] args) {
        int n = 20;
        int fib1 = 0, fib2 = 1;
        int powerOf2 = 2;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(fib1 + " ");
                int temp = fib1 + fib2;
                fib1 = fib2;
                fib2 = temp;
            } else {
                System.out.print(powerOf2 + " ");
                powerOf2 *= 2;
            }
        }
    }
}
