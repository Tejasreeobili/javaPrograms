import java.util.Scanner;

public class arrays  {
    public static void main(String[] args) {
        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true; // Assume the number is prime

            // Check if the number is divisible by any number from 2 to sqrt(num)
            for (int i = 2; i <=Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // If divisible, it's not prime
                    break; // No need to check further
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}