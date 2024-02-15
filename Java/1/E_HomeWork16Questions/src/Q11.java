public class Q11 {
    public static void main(String[] args) {
        int count = 0; 
        int number = 2;
        long sum = 0; 

        while (count < 100) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                sum += number;
                count++;
            }
            number++;
        }
        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }
}
