import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to convert a string to an integer in Java.
public class Exercise51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String string = scanner.next();
        if(!string.matches(".*[a-z].*")){
            int num = Integer.parseInt(string);
            System.out.println("The integer value is: " + num);
        }else{
            System.out.println("Only number is allowed");
        }
    }
}
