import java.util.Scanner;
public class io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your salary: ");
        float salary = sc.nextFloat();

        System.out.println("Enter your gender: ");
        char gender = sc.next().charAt(0);

        System.out.println(name);
        System.out.print(age+ " ");
        System.out.println(gender);
        System.out.print(salary+ " ");
        System.out.print("My trainer name is Navneet");
    }
}

