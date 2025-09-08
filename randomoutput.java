

import java.util.Random;

public class randomoutput {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int number1;
        
        number1 = random.nextInt(1,7); //trille terning feks
        
        System.out.println(number1);




        boolean isHeads;                //coin flip feks
        
        isHeads = random.nextBoolean();
        System.out.println(isHeads);
    }
}