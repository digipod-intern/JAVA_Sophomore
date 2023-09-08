/* 
 * Write a program to calculate the bill of a shopkeeper. Check whether he is in 
 * profit or loss. If he is in profit, then calculate the profit percentage and
 * if he is in loss, then calculate the loss percentage.
*/
import java.util.Scanner;
public class shopkeeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Cost Price of the product: ");
        int costPrice = scanner.nextInt();

        System.out.println("Enter Selling Price of the product: ");
        int sellingPrice = scanner.nextInt();

        if (costPrice < sellingPrice) {
            System.out.println("Shopkeeper is in profit.");
            int profit = sellingPrice - costPrice;
            int profitPercentage = (profit * 100) / costPrice;
            System.out.println("Profit is: " + profit + " and profit percentage is: " + profitPercentage);
        } else if (costPrice > sellingPrice) {
            System.out.println("Shopkeeper is in loss.");
            int loss = costPrice - sellingPrice;
            int lossPercentage = (loss * 100) / costPrice;
            System.out.println("Loss is: " + loss + " and loss percentage is: " + lossPercentage);
        } else {
            System.out.println("Shopkeeper is neither in profit nor in loss.");
        }
    }
}
