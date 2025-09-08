import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        String name;
        int age;
        boolean isStudent;
        
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        
        
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        
        //gruppe 1 (Enklere å holde styr slik)
        if(name.isEmpty()) {
            System.out.println("You didnt enter your name");
        }
        else{
            System.out.println("Hello " + name + "!");
        }
        
        System.out.print("Are you a student (true/false): ");
        isStudent = scanner.nextBoolean();
        
        
        //gruppe 2 (enklere å holde styr slik)
        if(age >= 65){
            System.out.println("You are a senior");
        }
        else if(age < 0) {
            System.out.println("You havent been born yet");
        }
        
        else if(age == 0) {
            System.out.println("You are a baby");
        }
        
        else if(age >= 18) {
            System.out.println("You are an adult");
        }
        
        else {
            System.out.println("You are NOT an adult");
        }
        
        //gruppe 3
        if(isStudent) {
            System.out.println("You are a student");
        }
        else {
            System.out.println("You are NOT a student");
        }
        
        scanner.close();
    }
        
}