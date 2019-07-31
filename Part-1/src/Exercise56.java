import java.util.Scanner;

/**
 * @author Kanan
 */
public class Exercise56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int x = scanner.nextInt();
        System.out.print("Input second number: ");
        int y = scanner.nextInt();
        System.out.print("Input third number: ");
        int p = scanner.nextInt();
        int count = 0;
        if(y < x){
            for(int i = y;i <= x;i++){
                if(i%p == 0){
                    count++;
                }
            }
        }else{
            for (int i = x; i <= y; i++) {
                if (i % p == 0) {
                    count++;
                }
            }
        }
        System.out.println("Count: " + count);
    }
}
