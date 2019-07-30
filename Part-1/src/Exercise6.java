import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
public class Exercise6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("\n");
        System.out.print("Input first number: ");
        double num2 = scanner.nextDouble();
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1%num2));
    }
}
