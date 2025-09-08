import java.util.Scanner;

public class MathPowerWhileLoop { // regne ut x^n ved hjelp av en while loop
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vi skal nå beregne x^n ved hjelp av en while-loop: ");
        System.out.print("\nSkriv verdi for (x): ");
        double x = input.nextDouble();

        System.out.print("Skriv verdi for (n): ");
        int n = input.nextInt();

        double resultat = 1.0;
        int nyN = n; 

        if (n < 0) {
            nyN = -n;
        }
        
        while (nyN > 0) {
            resultat *= x;
            nyN--;
        }

        if (n < 0) {
            resultat = 1.0 / resultat;
        }

        System.out.println(x + "^" + n + " = " + resultat);
        input.close();
    }
}