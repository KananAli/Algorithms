import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to print the area and perimeter of a circle.
public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius: ");
        double r = scanner.nextDouble();
        System.out.println("Area is = " + (Math.PI * Math.pow(r,2)));
        System.out.print("Perimeter is = " + (2 * Math.PI * r));
    }
}
