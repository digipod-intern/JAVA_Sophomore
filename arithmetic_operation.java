// Write a java program to input two numbers and perform all arithmetic operations.
public class arithmetic_operation {
    public static void main(String[] args) {
        int a = 24;
        int b = 56;
        // Calculations
        int sum = a+b;
        int diff = a-b;
        int prod = a*b;
        int quot = a/b;
        int rem = a%b;
        //Printing
        System.out.println("The sum of " + a + " and " + b + " is " + sum + ".");
        System.out.println("The difference of " + a + " and " + b + " is " + diff + ".");
        System.out.println("The product of " + a + " and " + b + " is " + prod + ".");
        System.out.println("The quotient of " + a + " and " + b + " is " + quot + ".");
        System.out.println("The remainder of " + a + " and " + b + " is " + rem + ".");
        System.out.println("Pre-increment value of " + a + " is " + ++a + ".");
        System.out.println("Post-increment value of " + b + " is " + b++ + ".");
        System.out.println("Pre-decrement value of " + a + " is " + --a + ".");
        System.out.println("Post-decrement value of " + b + " is " + b-- + ".");
        System.out.println("Value of a is " + a + "and value of b is " + b + ".");
    }
}
