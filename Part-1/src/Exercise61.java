import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to reverse a word.
public class Exercise61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a word: ");
        String string = scanner.nextLine();
        String reverse = " ";
        for(int i = string.length()-1;i>=0;i--){
            reverse += string.charAt(i);
        }
        System.out.print("Reverse word: " + reverse.trim());
    }
}
