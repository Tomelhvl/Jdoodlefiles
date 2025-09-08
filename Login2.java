import java.util.Scanner;

public class Login2 {

	public static void main(String[] args) {

		String r_passord = "hemli";
		String r_brukernavn = "navn";

		Scanner input = new Scanner(System.in);

		String funksjonTxt = "Velg funksjon\n a) - login";

		System.out.println(funksjonTxt);
		System.out.print(">");

		String valgTxt = input.nextLine();

		switch (valgTxt) {

	
		case "a":
			System.out.print("Login\nBrukernavn:");
			String brukernavn = input.nextLine();
			
			if (brukernavn.equals(r_brukernavn)) {
			    
		
					
				}
			
			boolean loggedinn = false;
			int forsok = 0;
					
			do {
				
				forsok++;
				System.out.print("Passord:");
				String passord = input.nextLine();
				
				if (passord.equals(r_passord)) {
					loggedinn = true;
					
				}
				
			
			} while ((!loggedinn) && (forsok < 3));
			
			if (loggedinn ) {
				System.out.println("Du er nå logged inn");
			} else {
				System.out.println("Login failed");
			}
			
			break;
		default:
			System.out.println("Ingen funksjon valgt");
		}
		
		input.close();
	}
}