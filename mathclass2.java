import java.util.Scanner;

public class mathclass2 {
    public static void main(String[] args) {
    
    //circumference = 2 * Math.PI * radius;
    //area = Math.PI * Math.pow(radius, 2);
    //volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
    //printf = antall desimaler
    
        Scanner scanner = new Scanner(System.in);
    
        double radius;
        double circumference;
        double area; 
        double volume; 
        
        
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        
        //printf definerer antall desimaler, &f, &.0f, &.1f, %.2f osv
        
        System.out.printf("The circumference is: %.0fcm\n" , circumference);
        System.out.printf("The area is: %.2fcm^2\n" , area);
        System.out.printf("The volume is: %.3fcm^3\n" , volume);
        scanner.close();
    }
}