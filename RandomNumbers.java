import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) System.out.print(random.nextInt(100) + 1 + " ");
    }
}
