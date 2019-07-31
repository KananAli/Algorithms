import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to count the letters, spaces, numbers and other characters of an input string.
public class Exercise38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The string is : ");
        String string = scanner.nextLine();
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;
        for(int i = 0;i<string.length();i++){
            Character character = string.charAt(i);
            if(Character.isLetter(character)){
                letter++;
            }else if(Character.isSpaceChar(character)){
                space++;
            }else if(Character.isDigit(character)){
                number++;
            }else{
                other++;
            }
        }
        System.out.println("Letter: " + letter);
        System.out.println("Space: " + space);
        System.out.println("Number: " + number);
        System.out.println("Other: " + other);
    }
}
