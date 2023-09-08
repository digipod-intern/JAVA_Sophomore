public class input {
    public static void main(String[] args) {
        input i = new input();
        calc c = new calc();
        variables v = new variables();
        logical l = new logical();
        largest la = new largest();

        i.sum();
    }

    public void sum(){
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Sum of a and b is: " + c);
    }

    public void sub(){
        int a = 10;
        int b = 20;
        int c = a - b;
        System.out.println("Subtraction of a and b is: " + c);
    }

    public void mul(){
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println("Multiplication of a and b is: " + c);
    }

    public void div(){
        int a = 10;
        int b = 20;
        int c = a / b;
        System.out.println("Division of a and b is: " + c);
    }

    public void mod(){
        int a = 10;
        int b = 20;
        int c = a % b;
        System.out.println("Modulus of a and b is: " + c);
    }
}


/* new operator/keyword: Creates new object of any class.
 * dot operator: Used to access members of a class.
 */