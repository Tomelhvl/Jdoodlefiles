import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
       
        
        Scanner scanner = new Scanner(System.in);
        
        int lowestValue = Integer.MAX_VALUE; // Initialize with the largest possible integer value

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();

            if (input == 0) { // Sentinel value to stop input
                break;
            }

            lowestValue = Math.min(lowestValue, input); // Update lowestValue with the smaller of the two
        }

        if (lowestValue == Integer.MAX_VALUE) { // Check if no valid numbers were entered
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The lowest value entered is: " + lowestValue);
        }

        scanner.close();
    }
}