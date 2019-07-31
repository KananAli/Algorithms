import java.util.Scanner;

/**
 * @author Kanan
 */
/*
Write a Java program that accepts three integers from the user and
return true if two or more of them (integers ) have the same rightmost digit.
the integers are non-negative.
 */
public class Exercise54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Input the second number: ");
        double number2 = scanner.nextDouble();
        System.out.print("Input the third number: ");
        double number3 = scanner.nextDouble();
        if((number1 % 10) == (number2%10) || (number1 % 10) == (number3%10) || (number2 % 10) == (number3%10)){
            System.out.println("The result is: " + true);
        }else{
            System.out.println("The result is: " + false);
        }
    }
}
