import java.util.Scanner;

public class mathclass {
    public static void main(String[] args) {
    
        double result1;
        result1 = Math.pow(2, 3); // x opphøyd i n
        System.out.println(result1);
        
        double result2;
        result2 = Math.abs(-5); // absolutt verdi
        System.out.println(result2);
        
        double result3;
        result3 = Math.sqrt(9); // kvadratroten av
        System.out.println(result3);
        
        double result4;
        result4 = Math.round(9.583493); // avrunding til nærmeste heltall
        System.out.println(result4);
        
        double result5;
        result5 = Math.ceil(9.583493); // avrunding OPP til nærmeste heltall
        System.out.println(result5);
        
        double result6;
        result6 = Math.floor(9.583493); // avrunding NED til nærmeste heltall
        System.out.println(result6);
        
        double result7;
        result7 = Math.max(3, 8); // Størst verdi av to tall
        System.out.println(result7);
        
        double result8;
        result8 = Math.min(3, 8); // Minst verdi av to tall
        System.out.println(result8);
        
        
        //HYPOTENUS c = Math.sqrt(a^2 + b^2)
        Scanner scanner = new Scanner(System.in);
        
        double a;
        double b;
        double c; 
        
        System.out.println("Enter length of side A: ");
        a = scanner.nextDouble();
        System.out.println("Enter length of side B: ");
        b = scanner.nextDouble();
        
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The HYPOTENUS C has a length of : " + c + "cm");
        
        
        
        scanner.close();
        
        
    }
}