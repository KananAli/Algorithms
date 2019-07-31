import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Kanan
 */
public class Exercise47 {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss.SSS");

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Now: " + dtf.format(localDateTime));
    }
}
