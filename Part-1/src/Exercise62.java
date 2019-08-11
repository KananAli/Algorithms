import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program that accepts three integer values and return true if one of them is 20 or more and less than the subtractions of others.
public class Exercise62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input first number: ");
        int num3 = scanner.nextInt();
        boolean bool = false;
        if(num1 >= 20 && num1 < (Math.abs(num2 - num3))){
            bool = true;
        }else if(num2 >= 20 && num2 < (Math.abs(num1-num3))){
            bool = true;
        }else if(num3 >= 20 && num3 < (Math.abs(num1 - num3))){
            bool = true;
        }
        System.out.println(bool);
    }
}
