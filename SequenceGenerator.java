public class SequenceGenerator {

    public static void main(String[] args) {
        int limit = 1000;  
        int a1 = 0,a2=1; 
        int b = 2;
        
        System.out.print(a1 + ", " + b);
        
        
        while (b <= limit) {
            int temp = a1;
            a1=a2;
            a2 = temp+a2;
            b = b * 2;
            if (b <= limit) {
                System.out.print(", " + a1 + ", " + b);  // Print the pair
            }
        }
    }
}
