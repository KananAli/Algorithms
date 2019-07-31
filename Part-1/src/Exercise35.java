import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to compute the area of a polygon.
public class Exercise35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        int n = scanner.nextInt();
        System.out.print("Input the length of one of the sides: ");
        double s = scanner.nextDouble();
        double area = (n * Math.pow(s,2))/(4 * Math.tan(Math.PI/n));
        System.out.println("The area is: " + area);
    }
}
