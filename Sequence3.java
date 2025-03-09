public class Sequence3 {
    public static void main(String[] args) {
        int n = 20, oddTerm = 2, factorial = 1, count = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(oddTerm + " ");
                oddTerm += 2;
            } else {
                factorial *= count;
                System.out.print(factorial + " ");
                count++;
            }
        }
    }
}
