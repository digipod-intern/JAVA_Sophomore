/* 
 * Buffered Class: Synchronized Class: Fast: We have to write more in this.
 * Scannner Class: Unsynchronized Class: Slow: We have to write less in this.
*/
import java.util.*;
public class Input_Output {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println(sum);
    }
}
