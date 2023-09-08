import java.io.*;
public class buffer {
    public static void main(String args[]) throws IOException {
        
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);

        // BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        // var buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first numbers: ");
        int a = Integer.parseInt(buffer.readLine());
        System.out.println("Enter second numbers: ");
        int b = Integer.parseInt(buffer.readLine());

        int sum = a + b;

        System.out.println("The sum of " + a + " and " + b + "is: " + sum);
    }
}

// Write a program to calculate the remainder of two numbers.