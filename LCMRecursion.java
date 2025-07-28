
import java.util.Scanner;

public class LCMRecursion {

    // Recursive function to find the greatest common divisor 
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to find LCM using the formula
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Ask user for input
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int result = lcm(num1, num2);
            System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter whole numbers only.");
        }
    }
}
