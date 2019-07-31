import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn
public class Exercise44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        System.out.print(n + " + " + (n * 10 + n) + " + " + (n * 100 + n * 10 + n));

    }
}
