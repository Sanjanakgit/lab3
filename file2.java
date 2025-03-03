import java.util.Scanner;

public class file2{
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Calculate the area of the circle
        double area = Math.PI * radius * radius;
        
        // Output the result
        System.out.println("The area of the circle is: " + area);
        
        // Close the scanner
        scanner.close();
    }
}
