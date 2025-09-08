import java.util.Scanner;

public class IfEksempel {

    public static void main(String args[]) {
                
        Scanner in = new Scanner(System.in);

        System.out.print("PPM: ");
        int co2 = in.nextInt();
        
        System.out.print(co2);
        
        if (co2 <=500) {
            
            System.out.println("GRØNN");
            
        } else {
            System.out.println("RØD");
        }

        
        in.close();
    }
}