import static java.lang.Math.*;
import java.util.Scanner;

public class BeregneMinsteTall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
    System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
    System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();
    System.out.print("Enter the fourth number: ");
        double num4 = input.nextDouble();
        
        double lowestNumber = Math.min(num1, num2);
        double lowestNumber2 = Math.min(num3, num4);
        double lowestNumber3 = Math.min(lowestNumber, lowestNumber2);
        
        System.out.println("The lowest number is: " + lowestNumber3);
        input.close();
    }
}