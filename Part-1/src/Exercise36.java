import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to compute the distance between two points on the surface of earth.
public class Exercise36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double radius = 6371.01;
        System.out.print("Input the latitude of coordinate 1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double y2 = scanner.nextDouble();
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println("The distance between those points is: " + d + " km");
    }
}
