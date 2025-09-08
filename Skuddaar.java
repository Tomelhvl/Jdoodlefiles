import java.util.Scanner;

public class Skuddaar {

    public static void main(String args[]) {
        
       Scanner input = new Scanner(System.in);
        
         System.out.print("År:");
         int aar = input.nextInt();
         
         System.out.print("Måned:");
         int mnd = input.nextInt();
                 
        
        int antDager = 31;
        
        if (mnd == 4 || mnd == 6 || mnd == 9 || mnd == 11){
            antDager = 30;
        }
        
        if (mnd == 2) {
            
            antDager = 28;
            
            boolean skuddaar = false;
            
            if (skuddaar) {
                
                antDager = 29;
            }
    
        }
        
        System.out.println(antDager);
    
        input.close();
    }
}