import java.util.Scanner;
public class monthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month: ");
        String month = sc.next();

        switch(month.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("31 days");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("30 days");
                break;
            case "february":
                System.out.println("28 days");
                break;
            default:
                System.out.println("Invalid month.");
        } 
    }
}
