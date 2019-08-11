import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to find the penultimate (next to last) word of a sentence.
public class Exercise60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a String: ");
        String sentence = scanner.nextLine();
        String[] array = sentence.split(" ");
        String penultimate;
        if(array.length > 1){
            penultimate = array[array.length - 2];
            System.out.print("Penultimate word: " + penultimate);
        }else{
            System.out.println("There are no enough number of word");
        }
    }
}
