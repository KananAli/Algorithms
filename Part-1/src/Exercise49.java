import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
public class Exercise49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        if(num % 2 == 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
