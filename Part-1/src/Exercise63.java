import java.util.Scanner;

/**
 * @author Kanan
 */
/*Write a Java program that accepts two integer values from the user and return the larger values.
However if the two values are the same, return 0 and return the smaller value
if the two values have the same remainder when divided by 6.
 */
public class Exercise63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
    }
}
