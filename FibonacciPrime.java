public class FibonacciPrime {
    public static void main(String[] args) {
        int first = 0, second = 1, count = 8, foundPrimes = 0;
        while (foundPrimes < count) {
            int next = first + second;
            first = second;
            second = next;

            if (next > 1) {
                boolean isPrime = true;
                for (int i = 2; i < next; i++) {
                    if (next % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(next + " ");
                    foundPrimes++;
                }
            }
        }
    }
}
