import java.util.Scanner;

/**
 * @author Kanan
 */
/*Write a Java program that accepts three integers from the user and return true
if the second number is greater than first number and third number is greater than second number.
If "abc" is true second number does not need to be greater than first number.
 */
public class Exercise53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double number1 = scan.nextDouble();
        System.out.print("Input the second number: ");
        double number2 = scan.nextDouble();
        System.out.print("Input the third number: ");
        double number3 = scan.nextDouble();
        boolean result = test(number1,number2,number3,true);
        System.out.println("The result is: " + result);

    }
    private static boolean test(double a,double b,double c,boolean abc){
        if(abc){
            return b < c;
        }
        return (a < b) && (b < c);
    }
}
