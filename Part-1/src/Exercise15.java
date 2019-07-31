import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to swap two variables.
public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Input second number: ");
        double num2 = scanner.nextDouble();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("First number: " + num1);
        System.out.print("Second number: " + num2);
    }
}
