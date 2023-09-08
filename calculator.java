import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter operator: ");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        if (operator == '+') {
            int sum = a + b;
            System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        } else if (operator == '-') {
            int difference = a - b;
            System.out.println("The difference of " + a + " and " + b + " is: " + difference);
        } else if (operator == '*') {
            int product = a * b;
            System.out.println("The product of " + a + " and " + b + " is: " + product);
        } else if (operator == '/') {
            int quotient = a / b;
            System.out.println("The quotient of " + a + " and " + b + " is: " + quotient);
        } else if (operator == '%') {
            int remainder = a % b;
            System.out.println("The remainder of " + a + " and " + b + " is: " + remainder);
        } else {
            System.out.println("Invalid operator.");
        } 
    }
}
