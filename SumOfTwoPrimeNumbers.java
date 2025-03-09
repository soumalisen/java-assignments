public class SumOfTwoPrimeNumbers {
    public static void main(String[] args) {
        int num = 34;
        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(num + " = " + i + " + " + (num - i));
                return;
            }
        }
        System.out.println("Cannot be expressed as sum of two primes.");
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) if (n % i == 0) return false;
        return n > 1;
    }
}

