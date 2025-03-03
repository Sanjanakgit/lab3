import java.util.Scanner;

public class file3 {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if the number is prime
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If num is divisible by i, it's not prime
            }
        }
        
        return true; // If no divisors are found, it's prime
    }
}
