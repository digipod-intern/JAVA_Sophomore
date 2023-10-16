import java.util.Scanner;

public class shapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape: ");
        String shape = sc.next();

        switch (shape) {
            case "circle":
                areaOfCircle();
                break;
            case "rectangle":
                areaOfRectangle();
                break;
                
            case "square":
                areaOfSquare();
                break;
            
            case "triangle":
                areaOfTriangle();
                break;
            
            case "parallelogram":
                areaOfParallelogram();
                break;

            case "cube":
                areaOfCube();
                break;

            default:
                System.out.println("Invalid shape.");
        }
    }

    public static void areaOfCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius = sc.nextInt();

        double area = 3.14 * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }

    public static void areaOfRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();

        int area = length * breadth;

        System.out.println("The area of the rectangle is: " + area);
    }

    public static void areaOfSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side: ");
        int side = sc.nextInt();

        int area = side * side;

        System.out.println("The area of the square is: " + area);
    }

    public static void areaOfTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        System.out.println("Enter the height: ");
        int height = sc.nextInt();

        int area = (base * height) / 2;

        System.out.println("The area of the triangle is: " + area);
    }

    public static void areaOfParallelogram() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        System.out.println("Enter the height: ");
        int height = sc.nextInt();

        int area = base * height;

        System.out.println("The area of the parallelogram is: " + area);
    }

    public static void areaOfCube() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side: ");
        int side = sc.nextInt();

        int area = 6 * side * side;

        System.out.println("The area of the cube is: " + area);
    }
}
