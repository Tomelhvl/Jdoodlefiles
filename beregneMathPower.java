import java.lang.Math.*;
import java.util.Scanner;

public class beregneMathPower {

    public static void main(String args[]) {
                
        Scanner in = new Scanner(System.in);
        System.out.print("Nå skal vi beregne X^n.\nSkriv inn verdi for X: ");
        double x = in.nextDouble();
        System.out.print("Skriv inn verdi for n: ");
        double n = in.nextDouble();
        double a = Math.pow(x,n);
        

        System.out.println("Verdien av " + x + "^" + n + ": " + a);

        
        in.close();
    }
}