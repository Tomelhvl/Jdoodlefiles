import java.util.Scanner;
public class sekunderOgDager {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Skriv antall sekunder: ");
        int totalSeconds = in.nextInt();

        int hours = totalSeconds / 3600; // 3600 seconds in an hour
        int remainingSecondsAfterHours = totalSeconds % 3600;

        int minutes = remainingSecondsAfterHours / 60; // 60 seconds in a minute
        int finalSeconds = remainingSecondsAfterHours % 60;

        System.out.println(totalSeconds + " seconds is equal to:");
        System.out.println(hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println(finalSeconds + " seconds");
        
        in.close();
    }
}