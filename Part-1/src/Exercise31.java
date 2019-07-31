/**
 * @author Kanan
 */
//Write a Java program to check whether Java is installed on your computer.
public class Exercise31 {
    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
        System.out.println("Operating System Version: " + System.getProperty("os.version"));
        System.out.println("Operating System Name: " + System.getProperty("os.name"));
        System.out.println("Operating System Architecture: " + System.getProperty("os.arch"));
        System.out.println("Java Compiler: " + System.getProperty("java.compiler"));
        System.out.println("Extension directory Path: " + System.getProperty("java.ext.dirs"));
        System.out.println("Library: " + System.getProperty("java.library.path"));
        System.out.println("Path Separator: " + System.getProperty("path.separator"));
        System.out.println("File Separator: " + System.getProperty("file.separator"));
        System.out.println("Current working directory of User: " + System.getProperty("user.dir"));
        System.out.println("User name: " + System.getProperty("user.name"));
    }
}
