public class Sequence2 {
    public static void main(String[] args) {
        int n = 20;
        int a = 0, b = 1;
        int Term = -1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(a + " ");
                int nextFib = a + b;
                a = b;
                b = nextFib;
            } else {
                System.out.print(Term + " ");
                Term -= 3;
            }
        }
    }
}
