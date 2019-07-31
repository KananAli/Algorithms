import java.util.Scanner;

/**
 * @author Kanan
 */
//Write a Java program to print the area and perimeter of a rectangle.
public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input width: ");
        double width = scanner.nextDouble();
        System.out.print("Input height: ");
        double height = scanner.nextDouble();
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.print("Perimeter is " + 2 + " * " + "(" + width + " + " + height + ")" + " = " + perimeter);
    }
}
