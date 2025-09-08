import java.util.Scanner;

public class SkriveUtDato {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Dag:");
		int dag = input.nextInt();

		System.out.print("Måned:");
		int mnd = input.nextInt();
		
		System.out.print("År:");
		int aar = input.nextInt();

		System.out.println(dag + "." + mnd + "." + aar);
		input.close();
	}

}