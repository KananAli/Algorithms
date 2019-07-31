import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program and compute the sum of the digits of an integer.
public class Exercise33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = scanner.nextInt();
        int sum = 0;
        if(num < 0){
            num *= -1;
        }
        while(num >= 1){
            sum += num%10;
            num = num/10;
        }
        System.out.println("sum of the digits of an integer"  + " = " + sum);
    }
}
