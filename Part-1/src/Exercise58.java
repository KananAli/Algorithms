import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to capitalize the first letter of each word in a sentence.
public class Exercise58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String sentence = scanner.nextLine();
        String[] array = sentence.split(" ");
        String capitalized = " ";
        for(int i= 0;i<array.length;i++){
            capitalized += Character.toUpperCase(array[i].charAt(0)) + array[i].substring(1) + " ";
        }
        System.out.print("Capitalized Sentence: " + capitalized.trim());
    }
}
