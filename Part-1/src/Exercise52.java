import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
public class Exercise52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Input the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Input the third number: ");
        double num3 = scanner.nextDouble();
        if((num1 + num2) == num3){
            System.out.print("The result is: " + true);
        }else{
            System.out.print("The result is: " + false);
        }
    }
}
