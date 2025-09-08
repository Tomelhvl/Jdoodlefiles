import java.util.Scanner;

public class OddetallElPartall {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		System.out.print("Skriv inn ditt ønskede heltall: ");
		int n = input.nextInt();
		int a = n % 2;

	   
	 if (a == 1) {
			System.out.println("Tallet er ett oddetall");
		} else {
	
	   	System.out.println("Tallet er ett partall");
	 
		input.close();

	    }
    }
}