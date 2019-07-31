import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to accepts an integer and count the factors of the number.
public class Exercise57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();
        int count = 0;
        for(int i = 1;i<=number;i++){
            if(number % i == 0){
                count++;
            }
        }
        System.out.print("Count: " + count);
    }
}
