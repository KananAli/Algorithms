import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to reverse a string.
public class Exercise37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = string.length()-1; i>=0;i--){
           char c = string.charAt(i);
           sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
