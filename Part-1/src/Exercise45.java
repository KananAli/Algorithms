import java.io.File;
import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to find the size of a specified file.
public class Exercise45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input file name: ");
        String string = scanner.next();
        File file = new File(string);
        long size = file.length();
        System.out.println(string + ": " + size + " bytes");
    }
}
