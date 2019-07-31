import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to compare two numbers.
public class Exercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first integer: ");
        double num1 = scanner.nextDouble();
        System.out.print("Input second integer: ");
        double num2 = scanner.nextDouble();
        if (num1 == num2) {
            System.out.println(num1 + " == " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else{
            System.out.println(num1 + " < " + num2);
        }
    }
}
