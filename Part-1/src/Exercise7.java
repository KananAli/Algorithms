import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program that takes a number as input and prints its multiplication table upto 10.
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(number + " x " + i + " = " + (number*i));
        }
    }
}
