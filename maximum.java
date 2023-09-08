/* 
 * Write a program to find the maximum between two numbers.
*/
import java.util.Scanner;
public class maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is greater than " + b + " and " + c);
        } else if (b > a && b > c) { 
            System.out.println(b + " is greater than " + a + " and " + c);
        } else {
            System.out.println(c + " is greater than " + a + " and " + b);
        }
    }
}
