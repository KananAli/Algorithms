import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to convert a given string into lowercase.
public class Exercise59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a String: ");
        String string = scanner.nextLine();
        String[] lowerCase = string.split(" ");
        String lower = " ";
        for(int i = 0;i<lowerCase.length;i++){
           for(int j= 0;j<lowerCase[i].length();j++){
               lower += Character.toLowerCase(lowerCase[i].charAt(j));
           }
           lower += " ";
        }
        System.out.print("LowerCase Sentence: " + lower);
    }
}
