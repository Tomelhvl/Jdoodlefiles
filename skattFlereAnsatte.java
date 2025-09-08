import java.util.Scanner; // beregne skatt ved hjelp av for-løkke og if-else

public class skattFlereAnsatte{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <=10; i++) {
            int lonn;
            while (true) {
                System.out.print("Skriv inn skatt for Ansatt nr: " + i + ": ");
                lonn = scanner.nextInt();
                
                if (lonn < 0) {
                    System.out.println("Kunne ikke beregne skatt, prøv på nytt!");
                } else {
                    break;
                }
            }
            
            if (lonn <= 217000) {
                System.out.println("Du ligger under grensen for trinnskatt og betaler derfor ingen trinnskatt!");
            } else if (lonn >= 217000 && lonn < 306050) {
                System.out.println("Du betaler 1,7% trinnskatt, som tilsvarer: ");
                System.out.println(lonn*0.017 + "kr i året");
            } else if (lonn >= 306051 && lonn < 697150) {
                System.out.println("Du betaler 4,0% trinnskatt, som tilsvarer: ");
                System.out.println(lonn*0.04 + "kr i året");
            } else if (lonn >= 697151 && lonn < 942400) {
                System.out.println("Du betaler 13,7% trinnskatt, som tilsvarer: ");
                System.out.println(lonn*0.137 + "kr i året");
            } else if (lonn >= 942401 && lonn < 1410750) {
                System.out.println("Du betaler 16,7% trinnskatt, som tilsvarer: ");
                System.out.println(lonn*0.167 + "kr i året");
            } else if (lonn >= 1410751) {
                System.out.println("Du betaler 17,7% trinnskatt, som tilsvarer: ");
                System.out.println(lonn*0.177 + "kr i året");
            }
        } 
    }
}