import java.util.Scanner;

public class ScannerPractice1 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Hello, What is your name?");
        String name = scan.next();

        System.out.println("What is your age?");
        int age= scan.nextInt();

        System.out.println("What do you do for living");
        String living = scan.next();

        System.out.println("where do you live");
        String location = scan.next();
        System.out.println("Thank you " +name+ ", You are " +age+" years old , You are " +living+", You live in "  + location );

    }


}
