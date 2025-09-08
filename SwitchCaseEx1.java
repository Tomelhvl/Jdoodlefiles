import java.util.Scanner;

public class SwitchCaseEx1 {

	public static void main(String[] args) {

		String mandag = null;
		String tirsdag = null;
		String onsdag = null;
		String torsdag = null;
		String fredag = null;
		String lørdag = null;
		String søndag = null;

		Scanner input = new Scanner(System.in);

		System.out.print("Skriv et tall mellom 1-7\n > ");

		String valgTxt = input.nextLine();

		switch (valgTxt) {

		case "1":
			System.out.print("Mandag");
			break;
		case "2":
			System.out.print("Tirsdag");
			break;
		case "3":
			System.out.print("Onsdag");
			break;
		case "4":
			System.out.print("Torsdag");
			break;
		case "5":
			System.out.print("Fredag");
			break;
		case "6":
			System.out.print("Lørdag");
			break;
		case "7":
			System.out.print("Søndag");
			break;
			
		default:
			System.out.println("Ugyldig tall");
		}


		input.close();
	}

}