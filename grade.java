import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();

        int grade = marks / 10;
        
        switch (grade) {
            case 9:
            case 10:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
                break;
            case 5:
                System.out.println("Grade E");
                break;
            default:
                System.out.println("Grade F");
        }
    }
}
