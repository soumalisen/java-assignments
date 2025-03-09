public class FactorialSeries {
    public static void main(String[] args) {
        int n = 5;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double fact = 1;
            for (int j = 1; j <= i; j++) fact *= j;
            sum += 1.0 / fact;
        }
        System.out.println("Sum: " + sum);
    }
}
