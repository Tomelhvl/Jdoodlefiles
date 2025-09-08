import java.util.Scanner;

public class RadiusBeregning {

    public static void main(String args[]) {
                
        Scanner in = new Scanner(System.in);

        System.out.print("Skriv høyde (i cm):");
        int h = in.nextInt();
        System.out.print("Skriv radius (i cm):");
        int r = in.nextInt();
        double b = r*r;
        double a = Math.PI;

        System.out.println("Sylinderens volum: " + a * b * h);


        in.close();
    }
}