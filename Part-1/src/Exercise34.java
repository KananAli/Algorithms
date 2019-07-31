import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to compute the area of a hexagon.
public class Exercise34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        double s = scanner.nextDouble();
        double area = (6 * s * s)/(4 * Math.tan(Math.PI/6));
        System.out.println("The area of the hexagon is: " + area);
    }
}
